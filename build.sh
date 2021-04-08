#!/bin/bash

./gradlew clean build
docker build -t antonvlasenko/webapp:0.0.1 .
docker push antonvlasenko/webapp:0.0.1