FROM --platform=linux/arm64 openjdk:17-ea-11
COPY build/libs/*.jar dockerservice.jar
# COPY src/main/resources/application.yml application.yml
ENTRYPOINT ["java","-jar","/dockerservice.jar"]
