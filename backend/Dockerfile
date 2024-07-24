FROM --platform=linux/arm64 openjdk:17-ea-11

COPY build/libs/*.jar dockerservice.jar
ENTRYPOINT ["java","-jar","/dockerservice.jar", "--spring.config.location=file:/security/"]
