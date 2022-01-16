#define base docker image

FROM openjdk:11
LABEL maintainer="prashant"

# copy the jar file from system file to docker system file
ADD target/kafka-microservice-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar .

# tells docker how application is going to run
ENTRYPOINT [ "java","-jar", "springboot-docker-demo.jar"]

