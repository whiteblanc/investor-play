# Use a lightweight JDK base image
FROM eclipse-temurin:21-jdk AS app

WORKDIR /app

# Copy the jar built by Maven/Gradle
COPY target/investor-play-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app runs on (default 8080)
EXPOSE 8080

# Start the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
