FROM java:8
MAINTAINER gokhantamkoc.com
VOLUME /tmp
COPY ./build/libs/restap-0.0.1.jar app.jar
RUN bash -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]