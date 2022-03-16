# Use OpenJDK 11 as base image
FROM openjdk:11
#create new app directory for my application files
RUN mkdir /app

# Copy files from my host machine into the image file system
COPY target/datastructures-and-algorithms-1.0-SNAPSHOT.jar/ /app

# Set directory for executing future commands
WORKDIR /app
