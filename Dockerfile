FROM openjdk:21-jdk-slim

MAINTAINER deepakchandramohan77

COPY target/crp-0.0.1-SNAPSHOT.jar crp-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","crp-0.0.1-SNAPSHOT.jar"]