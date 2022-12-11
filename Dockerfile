FROM ubuntu
LABEL maintainer="lifefire"
RUN apt update && apt upgrade
RUN apt-get install -y nginx python pip
RUN pip install docker-compose -y
RUN apt-get install openjdk maven


