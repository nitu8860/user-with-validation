# User Management System
## Frameworks and Language Used
- Java
- Spring Boot
- Hibernate
- MySQL
- Swagger

## Data Flow
### Controller
- **UserController:** Handles incoming HTTP requests related to user management, processes the requests and returns the responses.
### Services
- **UserService:** Performs business logic related to user management, interacts with IUserRepository to retrieve or manipulate user data.
### Repository
- **IUserRepository:** Defines methods for data access and manipulation related to users, implemented by UserRepository.

## Database Design
### User table:
- user_id (primary key, integer)
- user_name (varchar)
- date_of_birth (varchar)
- email (varchar)
- phone_number (varchar)
- date (date)
- time (timestamp)

## Data Structures Used in Your Project

- **JSON:** Used to pass data between the front-end (Swagger) and the back-end (Spring Boot).
- **List:** Used to store and manipulate lists of user data in the back-end.

## Project Summary

This project is a simple user management system implemented using Java, Spring Boot, Hibernate, MySQL, and Swagger. The system allows for the creation, retrieval, update, and deletion of user data. The back-end is implemented using the MVC architecture, with the UserController handling incoming requests, the UserService handling business logic, and the IUserRepository providing an interface for data access and manipulation. The system uses a MySQL database to store user data, and Swagger is used to interact with the back-end via HTTP requests.
