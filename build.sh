#!/bin/bash

./gradlew clean build
docker build -t antonvlasenko/webapp:0.0.1 -t antonvlasenko/webapp:latest .
docker push antonvlasenko/webapp:0.0.1
docker antonvlasenko/webapp:latest