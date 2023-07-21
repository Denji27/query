FROM openjdk:8-jre
RUN mkdir /que
WORKDIR /que
COPY ./target/query-0.0.1-SNAPSHOT.jar .
EXPOSE 8081
CMD ["java", "-jar", "query-0.0.1-SNAPSHOT.jar"]