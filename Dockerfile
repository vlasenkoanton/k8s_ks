FROM adoptopenjdk/openjdk11:jdk-11.0.9_11.1-alpine-slim

ENV MAX_RAM_PERCENTAGE=80

ARG ARTIFACT_PATH=build/libs
ARG ARTIFACT_NAME=*

ADD $ARTIFACT_PATH/$ARTIFACT_NAME /app/

ENTRYPOINT java \
  -XX:+UseContainerSupport \
  -XX:MaxRAMPercentage=$MAX_RAM_PERCENTAGE \
  -jar /app/*.jar