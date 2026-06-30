# Java Banking Application
***Currently in development***

A full-stack banking management application built with **Java**, **Spring Boot**, **PostgreSQL**, **Spring Data JPA**, **Hibernate**, and **Thymeleaf**. 
The application provides a user-friendly interface for managing users and financial transactions while demonstrating modern enterprise software 
development practices. The project follows the MVC architecture and leverages Spring Boot to build a scalable and maintainable web application.

## Features

- User account management
- Create, view, update, and delete customer records
- Record financial transactions
- PostgreSQL database integration
- Spring Data JPA repositories
- Hibernate ORM
- Responsive web interface using Thymeleaf
- Form validation
- MVC architecture
- RESTful design principles

## Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Primary programming language |
| Spring Boot | Application framework |
| Spring MVC | Web architecture |
| Spring Data JPA | Database access |
| Hibernate | Object Relational Mapping (ORM) |
| PostgreSQL | Relational database |
| Thymeleaf | Server-side templating |
| Maven | Dependency management |
| HTML5 | Frontend structure |
| CSS3 | Styling |
| Bootstrap | Responsive UI |

### Clone the repository

```bash
git clone https://github.com/Briar3497/Java-Banking-app.git
```

### Navigate to the project

```bash
cd Java-Banking-app
```

### Configure PostgreSQL

Update your `application.properties` file with your database credentials.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=postgres
spring.datasource.password=your_password
```

### Build the project

```bash
mvn clean install
```

### Run the application

```bash
mvn spring-boot:run
```

The application will start on:

```
http://localhost:8080
```

## Learning Objectives

This project demonstrates knowledge of:

- Object-Oriented Programming
- Enterprise Java Development
- MVC Architecture
- Database Design
- CRUD Operations
- Repository Pattern
- Dependency Injection
- Spring Boot Development
- Hibernate/JPA
- Form Validation
- SQL Database Integration
- Version Control with Git

## Future Improvements

- User authentication and authorization
- Password encryption
- Account balances
- Deposits and withdrawals
- Money transfers
- Transaction search and filtering
- REST API endpoints
- Docker support
- Cloud deployment
- Unit and integration testing
- Audit logging
- Email notifications

## Author

**Briar Lilly**

Software Engineer passionate about Java development, cloud computing, databases, and secure software engineering.

GitHub: https://github.com/Briar3497

## Repository

https://github.com/Briar3497/Java-Banking-app

## License

This project is available for educational and portfolio purposes.
