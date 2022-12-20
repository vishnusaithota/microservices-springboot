FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cloudconfig.jar
ENTRYPOINT ["java","-jar","/cloudconfig.jar"]
EXPOSE 9296