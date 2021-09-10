FROM openjdk:8
ADD target/docker-image-spring.jar docker-image-spring.jar
EXPOSE 8085
ENTRYPOINT [ "java","-jar","/docker-image-spring.jar" ]
