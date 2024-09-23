FROM amazoncorretto:21-alpine
ARG VERSION=1.0.0
COPY ./target/prime-ehr-${VERSION}.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]