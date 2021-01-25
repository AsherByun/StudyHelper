FROM openjdk:8
ADD target/study-helper-app-ver1.jar study-helper-app-ver1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "study-helper-app-ver1.jar"]