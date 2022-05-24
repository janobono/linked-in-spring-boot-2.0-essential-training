FROM maven:3-eclipse-temurin-17 as builder

WORKDIR /app

COPY ./pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests
COPY target/booting-web-*.jar app.jar

FROM eclipse-temurin:17-jre

WORKDIR /app

RUN addgroup --gid 1000 app; \
    adduser --disabled-password --gecos "" --home "$(pwd)" --ingroup app --no-create-home --uid 1000 app

RUN chown -R app:app /app

USER app

EXPOSE 8080

COPY --from=builder /app/app.jar /app/

ENTRYPOINT ["java","-jar", "/app/app.jar"]
