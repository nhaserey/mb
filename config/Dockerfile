#Start with base image containing java runtime
FROM openjdk:17 as build

# Information of owner or maintainer of image
MAINTAINER bank

# Add the application's jar to the container
COPY target/config-0.0.1-SNAPSHOT.jar config-0.0.1-SNAPSHOT.jar

#Execute the application
ENTRYPOINT ["java", "-jar","config-0.0.1-SNAPSHOT.jar"]