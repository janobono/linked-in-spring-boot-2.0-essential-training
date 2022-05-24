package sk.janobono.sbet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;

import java.util.stream.Stream;

@SpringBootApplication
public class FizzBuzzApplication {

    @Bean
    public CommandLineRunner run() {
        return args -> {
            Stream<Integer> infiniteStream = Stream.iterate(1, i -> i + 1);
            infiniteStream.limit(100).forEach(i -> {
                String result = "";
                result += (i % 3) == 0 ? "Fizz" : "";
                result += (i % 5) == 0 ? "Buzz" : "";
                System.out.println(StringUtils.hasLength(result) ? result : i);
            });
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(FizzBuzzApplication.class, args);
    }

}
