FROM openjdk:17-oracle

COPY target/emrapp-0.0.1-SNAPSHOT.jar /emrapp-0.0.1-SNAPSHOT.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","/emrapp-0.0.1-SNAPSHOT.jar"]