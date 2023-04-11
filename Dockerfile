FROM openjdk:17
EXPOSE 8080
ADD target/github_cicd_docker.jar github_cicd_docker.jar
ENTRYPOINT ["java","-jar","/github_cicd_docker.jar"]