FROM openjdk:11
COPY dronesManagement/target/dronesManagement-0.0.1-SNAPSHOT.jar /tmp/dronesManagement.jar
WORKDIR /tmp

CMD [ "java", "-jar", "/tmp/dronesManagement.jar"]
EXPOSE 9999