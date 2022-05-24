package sk.janobono.sbet.roomwebapp;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
class RoomWebAppApplicationTests {

    @Container
    public static PostgreSQLContainer<?> postgresDB = new PostgreSQLContainer<>
            ("postgres:13-alpine")
            .withDatabaseName("app")
            .withUsername("app")
            .withPassword("app");

    public static GenericContainer<?> rabbitMQ = new GenericContainer<>
            ("rabbitmq:3-management-alpine")
            .withEnv("RABBIT_USER", "app")
            .withEnv("RABBIT_PASS", "app")
            .withEnv("RABBITMQ_DEFAULT_VHOST", "vhost")
            .withExposedPorts(5672);

    @DynamicPropertySource
    public static void properties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgresDB::getJdbcUrl);
        registry.add("spring.rabbitmq.port", () -> {
            return rabbitMQ.getExposedPorts().get(0);
        });
    }

    @Value("${local.server.port}")
    public int serverPort;

    @Autowired
    public Flyway flyway;

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();
    }

    @Test
    void contextLoads() {
    }

}
