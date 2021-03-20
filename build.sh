#!/bin/bash

./gradlew clean build
docker build -t antonvlasenko/webapp:latest .
docker push antonvlasenko/webapp:latest