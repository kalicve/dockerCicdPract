FROM openjdk:17-oracle
EXPOSE 8080
ADD target/dockercicd.jar dockercicd.jar
ENTRYPOINT ["java", "-jar", "/dockercicd.jar" ]