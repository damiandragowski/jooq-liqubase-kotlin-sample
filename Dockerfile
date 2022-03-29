FROM openjdk:14-alpine

ARG JAR_FILE=sample-application.jar

ENV USER=spring

CMD mkdir -p /sample-application/app

RUN addgroup -S ${USER} && adduser -S -G ${USER} ${USER}
USER ${USER}

EXPOSE 8080

COPY ${JAR_FILE} /sample-application/app/sample-application.jar
WORKDIR /sample-application/app/

CMD java $JAVA_OPTIONS -Dspring.profiles.active=prod -jar sample-application.jar
