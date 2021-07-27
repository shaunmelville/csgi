FROM openjdk:11-jdk
LABEL MAINTAINER shaun@shaunmelville.com
RUN apt-get update && \
  apt-get -y upgrade && \
  apt-get install -y vim
COPY target/com.shaunmelville.poc-0.0.1-SNAPSHOT.jar com.shaunmelville.poc-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/com.shaunmelville.poc-0.0.1-SNAPSHOT.jar"]
