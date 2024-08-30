# TaskManagerPro

**TaskManagerPro** is a sample Spring Boot application designed for task management. It showcases core features of Spring Boot, including web functionality, data persistence, and transaction management.

## Project Overview

- **Controller**: Manages HTTP requests for task operations.
- **Service**: Contains business logic for handling tasks.
- **Service Impl**: Contains business logic implementation for handling tasks.
- **Repository**: Handles data access and persistence.
- **Entity**: Defines the task model.
- **Configuration**: Manages application settings.

- src
  └── main
  ├── java
  │   └── com
  │       └── example
  │           └── taskmanagerpro
  │               ├── controller
  │               │   └── TaskController.java
  │               ├── service
  │               │   ├── TaskService.java
  │               │   └── TaskServiceImpl.java
  │               ├── repository
  │               │   └── TaskRepository.java
  │               ├── entity
  │               │   └── Task.java
  │               ├── config
  │               │   └── AppConfig.java
  │               └── TaskManagerProApplication.java
  └── resources
  └── application.properties

1) Project is designed using the Layered Architecture Pattern,

DB ----->

1) Setup database configurations with mysql

# MySQL Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name?useSSL=false&serverTimezone=UTC
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA / Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Management Endpoints
management.endpoints.web.exposure.include=mappings

3) Perform CRUD operations with task

4) Practise sql queries (CRUD/JOINS/CRiTRIA)


