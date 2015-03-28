# This is a comment
FROM ubuntu:14.04
MAINTAINER Mike DuVall <mike.a.duvall@gmail.com>
RUN apt-get update &&  apt-get install -y software-properties-common
RUN add-apt-repository ppa:webupd8team/java
RUN apt-get update
RUN \
echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
apt-get install -y oracle-java8-installer
rm -rf /var/lib/apt/lists/* && \
rm -rf /var/cache/oracle-jdk8-installer

# Define working directory.
WORKDIR /app
# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle
# Define default command.
CMD ["bash"]