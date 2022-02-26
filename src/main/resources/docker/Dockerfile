FROM openjdk:11

# Default to UTF-8 file.encoding
ENV LANG C.UTF-8

RUN mkdir -p /opt
ADD maven/opt/cashreg-spring.jar /opt/cashreg-spring.jar


EXPOSE 8080

ENTRYPOINT java -jar /opt/cashreg-spring.jar -Djava.net.preferIPv4Stack=true