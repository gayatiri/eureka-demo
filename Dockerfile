FROM openjdk:11-jdk
EXPOSE 8081
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
