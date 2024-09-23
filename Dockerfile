FROM amazoncorretto:21-alpine
COPY ./target/prime-ehr-*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]