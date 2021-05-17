FROM java:12-jdk-alpine
COPY ./pizzaAPI-0.0.1-SNAPSHOT.jar /usr/app
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "pizzaAPI-0.0.1-SNAPSHOT.jar"]

