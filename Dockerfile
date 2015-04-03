# This is a comment
FROM mikeduvall/service_base
MAINTAINER Mike DuVall <mike.a.duvall@gmail.com>

#RUN mkdir /app
ADD build/libs/gs-spring-boot-0.1.0.jar /app/


# Define default command.
CMD ["java",  "-jar",  "gs-spring-boot-0.1.0.jar"]