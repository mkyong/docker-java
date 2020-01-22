## What is it?
This source code is an executable JAR file, using jsoup HTML parser to find all links from a URL. 
 
Tested with
* Docker 19.03
* Ubuntu 19
* Java 8
* Maven

For explanation, please visit this article - [Docker and Java Application](https://mkyong.com/docker/docker-and-java-application-examples/)

## How to run this?
```bash
$ git clone https://github.com/mkyong/docker-java
$ cd docker-java-app
$ mvn package
$ java -jar target/find-links.jar https://google.com

//dockerize
// create a docker image
$ sudo docker build -t docker-java:1.0 .
// run it
$ sudo docker run -t docker-java:1.0 https://google.com
```