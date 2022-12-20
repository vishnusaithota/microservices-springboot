FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} servicediscovery.jar
ENTRYPOINT ["java","-jar","/servicediscovery.jar"]
EXPOSE 8761