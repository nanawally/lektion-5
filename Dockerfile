FROM openjdk:21-jdk-slim
WORKDIR /app
COPY build/libs/lektion-5-0.0.1-SNAPSHOT.jar /app/my-spring-app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/my-spring-app.jar"]