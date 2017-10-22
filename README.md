# A Spring Boot RESTful API

This repository is a created for developing a RESTful API.

## Technologies Used

1. Spring Boot 1.5.6.RELEASE
2. gson 2.8.1
3. lombok 1.16.18

## How to Dockerize this Spring Boot App?

1. Build a jar file for this app.
2. Create a folder.
3. Put the Dockerfile and the *.jar file to the created folder
4. run ```sudo docker build -t springrestapi  .``` to create the image.
5. run ```sudo docker run --rm -p 9000:8080 --name springrestapi-instance-01 --detach springrestapi``` command to start your app.
6. Open your browser and go to http://localhost:9000/api/greeting

> --rm option means when the container stopped, docker deletes it automatically.

> To see the application log run below command:

```
$ sudo docker container logs springrestapi-instance-01
```

> To stop the running docker container run below command:

```
$ sudo docker container stop springrestapi-instance-01
```

> To delete the image run below command:

```
$ sudo docker image rm springrestapi
```

> **WARNING!!!** Never let your app save data inside a container. Containers are temporary instance of an image. When it is stopped, the data will vanish.