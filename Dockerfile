FROM eclipse-temurin:21-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} keno-backend-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/keno-backend-app.jar"]
