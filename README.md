# Tutorial backend Ludoteca Microservices Project

This project was generated with [Spring Boot](https://spring.io/projects/spring-boot)
using [Spring Initializr](https://start.spring.io/) and is
based on **Java**.

## Description

A distributed microservices-based web application built with to manage a ludoteca (board game library), where users can
manage
games, categories, and authors.

- https://github.com/anapi76/LudotecaMicroservices.git

## Requirements

- IntelliJ IDEA
- Spring Boot version 3.3.5
- Java 17.0.13 or higher.
- Maven
- Postman for testing

## Add Dependencies

To add a new dependency in every microservice, search it in [Maven Repository](https://mvnrepository.com/) and add it to
the `<dependencies>`
section of the pom.xml file.

- Spring Web
- Spring Data JPA
- H2 Database
- Modelmapper
- Hibernate-validator
- OpenApi

## Documentation

This project uses **OpenAPI** to describe the API endpoints.

## Running the Microservices

- Gateway-service: http://localhost:8080
- Eureka-service: http://localhost:8761
- Category-service: http://localhost:8091
- Author-service: http://localhost:8092
- Game-service: http://localhost:8093

## Configuring Database

- http://localhost:8080/h2-console

## Microservices

### 1. Eureka Microservice

### 2. Gateway Microservice

### 3. Category Microservice

- Description: Handles business logic related to category.
- Routes:
    - GET /category: Get all categories.
    - PUT /category: Create a new category.
    - PUT /category/{id}: Update a category.
    - DELETE /category/{id}: Delete a category.

- **OpenAPI Documentation (JSON)**: [http://localhost:8091/v3/api-docs](http://localhost:8091/v3/api-docs)
- **OpenAPI Documentation (YAML)**: [http://localhost:8091/v3/api-docs.yaml](http://localhost:8091/v3/api-docs.yaml)
- **Swagger UI**: [http://localhost:8091/swagger-ui/index.html](http://localhost:8091/swagger-ui/index.html)

### 4. Author Microservice

- Description: Handles business logic related to author.
- Routes:
    - GET /author: Get all categories.
    - POST /author: Get a paginated listing of authors.
    - PUT /author: Create a new author.
    - PUT /author/{id}: Update an author.
    - DELETE /author/{id}: Delete an author.

- **OpenAPI Documentation (JSON)**: [http://localhost:8092/v3/api-docs](http://localhost:8092/v3/api-docs)
- **OpenAPI Documentation (YAML)**: [http://localhost:8092/v3/api-docs.yaml](http://localhost:8092/v3/api-docs.yaml)
- **Swagger UI**: [http://localhost:8092/swagger-ui/index.html](http://localhost:8092/swagger-ui/index.html)

### 5. Game Microservice

- Description: Handles business logic related to game.
- Routes:
    - GET /game: Get a filtered list of Games.
    - PUT /game: Create a new game.
    - PUT /game/{id}: Update a game.

- **OpenAPI Documentation (JSON)**: [http://localhost:8093/v3/api-docs](http://localhost:8093/v3/api-docs)
- **OpenAPI Documentation (YAML)**: [http://localhost:8093/v3/api-docs.yaml](http://localhost:8093/v3/api-docs.yaml)
- **Swagger UI**: [http://localhost:8093/swagger-ui/index.html](http://localhost:8093/swagger-ui/index.html)





