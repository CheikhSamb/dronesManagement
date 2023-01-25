FROM openjdk:11
COPY dronesManagement/target/dronesManagement-0.0.1-SNAPSHOT.jar dronesManagement.jar

CMD [ "java", "-jar", "/dronesManagement.jar"]
EXPOSE 9999