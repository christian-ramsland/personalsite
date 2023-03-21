# Build stage
#
FROM maven:3.8.4-openjdk-11 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre
COPY --from=build /home/app/target/backend-0.0.1-SNAPSHOT.jar /usr/local/lib/app.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]




# Standalone java app dockerfile - no reason to have this here other than for posterity, this is not how SB apps are run

# Build stage
#
# FROM maven:3.8.4-openjdk-11 AS build
# COPY src /home/app/src
# COPY pom.xml /home/app
# RUN mvn -f /home/app/pom.xml clean package
#
# #
# # Package stage
# #
# FROM openjdk:11-jre
# COPY --from=build /home/app/target/backend-0.0.1-SNAPSHOT.jar /usr/local/lib/app.jar
# ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]