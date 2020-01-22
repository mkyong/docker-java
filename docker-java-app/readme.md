# Docker build steps

## Build image
$ cd $project
$ sudo docker build -t docker-java:1.0 .

## Build container and run it.
$ sudo docker run -t docker-java:1.0 https://google.com

## Access the docker image file system 
# comment ENTRYPOINT to avoid container run the jar file during startup
# $ sudo docker run -it docker-java:1.0 /bin/sh
