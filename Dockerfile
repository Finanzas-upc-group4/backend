FROM openjdk:17-alpine

COPY target/grupo4-0.0.1-SNAPSHOT.jar /

RUN sh -c 'touch grupo4-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","/grupo4-0.0.1-SNAPSHOT.jar"]

RUN chmod +x /grupo4-0.0.1-SNAPSHOT.jar