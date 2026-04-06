# Use an official JDK runtime as the base image
FROM eclipse-temurin:17-jdk-alpine

# Create a directory for the app
WORKDIR /app

# Copy the JAR file built by Maven into the container
# Jenkins runs 'mvn clean verify' first, which creates this file
COPY target/*.jar app.jar

# Expose the port your Spring Boot app runs on (usually 8080)
EXPOSE 8080

# The command to start your application
ENTRYPOINT ["java", "-jar", "app.jar"]
