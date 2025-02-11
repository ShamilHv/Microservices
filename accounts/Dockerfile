FROM openjdk:21-jdk-slim

LABEL version="1.0"
LABEL description="Accounts microservice built with Java 21 and Spring Boot"
LABEL maintainer="samilheyderov2003@gmail.com"

COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]

