# MicroServiceImplementation

A basic implementation of kafka queues with microservices.

# Requirement

1.java <= 11
2.mvn - latest
3.Docker

# Step to run the code

1. Run cmd mvn package to create a jar file
2. After creating a jar file run cmd

```
 docker build -t springboot-docker:latest

```

3.  Now run cmd

```
docker run -p 8080:8080 springboot-docker

Now you can open your browser and type in http://localhost:8080/message

```
