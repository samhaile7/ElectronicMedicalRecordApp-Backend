FROM eclipse-temurin:17
ARG JAR_FILE=target/*.jar
COPY ./target/emrapp-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]