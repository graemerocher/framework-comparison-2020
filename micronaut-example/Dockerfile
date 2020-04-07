FROM openjdk:14-alpine
COPY target/micronaut-example-*.jar micronaut-example.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-example.jar"]
