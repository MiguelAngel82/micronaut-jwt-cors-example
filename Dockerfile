FROM java:openjdk-8u111-alpine
RUN apk --no-cache add curl
COPY build/libs/*-all.jar micronaut-jwt-cors-example.jar
CMD java ${JAVA_OPTS} -jar micronaut-jwt-cors-example.jar