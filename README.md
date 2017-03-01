# Spring Project

The project is to demonstrate how we can configure a spring application to allow the use of

  - Spring Boot
    - http://localhost:8181/swagger-ui.html
    - http://localhost:8181/example/rules
  - WAR Deployment (Currently configured for JBoss 7 only)
    - http://localhost:8080/spring-template-war-0.0.1-SNAPSHOT/api/swagger-ui.html
    - http://localhost:8080/spring-template-war-0.0.1-SNAPSHOT/api/example/rules
  - EAR Deployment (Currently configured for WebSphere 7 only)

The project contains

  - Spring Web
  - Spring JDBC
  - DB2 Drivers
  - Swagger

## Build

There are 3 way to build this project depending on your requirements

### Spring Boot

When using spring boot its dead easy to run.

```
mvn -Pboot
```

**You need to be in the _spring-project/spring-template-war_ directory**

This runs the maven build with using the _boot_ profile. This profile is configured to add the DB2 drivers on the classpath and also then run the _spring-boot:run_ goal.

### WAR

If you want to create a WAR file for deployment then this is the place for you.

```
mvn clean package
```

**You need to be in the _spring-project/spring-template-war_ directory**

### EAR

This would be run if you want to deploy this into WebSphere or the like.

```
mvn clean package
```

**You need to be in the _spring-project_ directory**
