FROM openjdk:17.0.2-jdk-slim-buster

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} redis-common-service.jar

EXPOSE 8080:8080

ENTRYPOINT ["java","-jar","/redis-common-service.jar"]

ENV DATABASE_HOST=host.docker.internal \
    REDIS_HOST=host.docker.internal