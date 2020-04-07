# Micronaut 2.0 M2 vs Quarkus 1.3.1 vs Spring Boot 2.3 M2 on JDK 14

This repo contains a performance comparison between Micronaut 2.0 M2 vs Quarkus 1.3.1 vs Spring Boot 2.3 M2 on JDK 14. 

Associated YouTube video: https://www.youtube.com/watch?v=rJFgdFIs_k8&feature=youtu.be

### Setup

To setup first run

```
node install request
``` 

Then you can measure time to first response with:

```
node time.js PATH_TO_JAR
```

The results can be found in the report PDF.

### Q & A

*How was memory measured?*

Using the `ps` command on OS X to obtain the RSS memory:

```
ps x -o rss,vsz,command | grep java
```

*How was req/sec measured?*

Using `ab` with keep alive connections:

```
ab -k -c 20 -n 10000 http://localhost:8080/hello
```
