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
