FROM amazoncorretto:21-alpine
ARG VERSION
COPY target/prime-ehr-${VERSION}.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]