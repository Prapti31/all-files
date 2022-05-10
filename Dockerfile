FROM openjdk:11

ADD pwc-spring-MVC-0.0.1-SNAPSHOT.jar pwc-spring-MVC-0.0.1-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","pwc-spring-MVC-0.0.1-SNAPSHOT.jar"]

