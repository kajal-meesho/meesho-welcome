# Multi-stage build: compile with Maven, run on slim JRE.
FROM maven:3.8-openjdk-11 AS build
WORKDIR /build
COPY pom.xml .
RUN mvn -B -q dependency:go-offline
COPY src ./src
RUN mvn -B -q -DskipTests package

FROM eclipse-temurin:11-jre
WORKDIR /app
COPY --from=build /build/target/meesho-welcome.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
