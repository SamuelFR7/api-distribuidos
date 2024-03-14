FROM eclipse-temurin:17

WORKDIR /app

COPY build/libs/api-distribuidos-0.0.1-SNAPSHOT.jar /app/api-distribuidos-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "api-distribuidos-0.0.1-SNAPSHOT.jar"]