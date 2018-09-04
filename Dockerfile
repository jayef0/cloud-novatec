FROM openjdk:8-alpine
RUN mkdir -p /opt/rest
WORKDIR /opt/rest
COPY 1rest-0.0.1-SNAPSHOT.jar /opt/rest
CMD ["java", "-jar", "1rest-0.0.1-SNAPSHOT.jar"]