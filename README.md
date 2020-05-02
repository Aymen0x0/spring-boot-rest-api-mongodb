# REST CRUD API using Spring Boot and MongoDB 

## Prerequisites

```
JDK 1.8 or later
MongoDB (4.2)
Lombok Plugin for your IDE
Apache Maven 3.6.3
```

## Installing
Download and unzip the source repository for this guide, or clone it using Git:
```
git clone https://github.com/Aymen0x0/spring-boot-rest-api-mongodb.git
```

 ## Database Configuration
1.	Once you have installed and have started MongoDB (A MongoDB instance running on your localhost with default port 27017), create your database and choose a correct name.
2.	Open src/main/resources/application.properties and set the database name that you've created.
```
spring.data.mongodb.database= <YourDataBaseName>
```

## Build and run the application

You can run the application by using 
```
mvn spring-boot:run
```
Alternatively, you can build the JAR file with
```
mvn clean package
``` 
and then run the JAR file, as follows:
```
java -jar target/<generated-jar-file>.jar
```
## Testing the application
Open your Web Browser or a REST client app like (Postman, Advanced REST Client, etc.) and type :
```
http://localhost:8080/client
```
#### The app defines the following CRUD APIs.
```
GET /client
POST /client/add
GET /client/{clientId}
PUT /client/update/{clientId}
DELETE /client/delete/{clientId}
```

## Author

* **Aymen Mankari** - [Aymen0x0](https://github.com/Aymen0x0)
