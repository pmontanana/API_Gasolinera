FROM openjdk:23-jdk-slim
ARG JAR_FILE=target/gasolinera-0.0.1.jar
COPY ${JAR_FILE} gasolinera.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","gasolinera.jar"]