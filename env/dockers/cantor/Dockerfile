FROM centos:8

ARG version
ARG pipeline_args

LABEL pipeline=$pipeline_args

MAINTAINER pteyer@salesforce.com

ENV DEBIAN_FRONTEND noninteractive

RUN groupadd --system --gid 7447 cetrax
RUN adduser --system --gid 7447 --uid 7447 --shell /sbin/nologin cetrax

RUN yum install java -y

# work in cetrax home directory
WORKDIR /home/cetrax/

# add start script and cetrax jar
ADD start.sh /home/cetrax/start.sh
ADD cetrax-server.jar /home/cetrax/cetrax-server.jar
ADD cetrax-server.conf /home/cetrax/cetrax-server.conf
ADD cetrax-logback.xml /home/cetrax/cetrax-logback.xml

# make cetrax the owner
RUN chown -R cetrax /home/cetrax/

CMD bash ./start.sh /home/cetrax/cetrax-server.conf

