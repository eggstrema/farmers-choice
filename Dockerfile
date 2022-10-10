FROM gradle:7-jdk17-alpine AS builder
WORKDIR /app

COPY *.gradle system.properties ./
RUN gradle dependencies

COPY src src
RUN gradle build

FROM eclipse-temurin:17-jdk-alpine

COPY --from=builder /app/build/libs/farmers_choice-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
