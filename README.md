# BlogApp - Java Spring Boot Blog Application

A RESTful blog application built with Spring Boot, featuring user authentication, post management, categories, and tags.

## Features

- JWT-based authentication and authorization
- Create, read, update, and delete blog posts
- Organize posts with categories and tags
- PostgreSQL database with JPA/Hibernate
- Input validation
- Comprehensive error handling

## Tech Stack

- **Backend**: Spring Boot 4.1.1
- **Language**: Java 21
- **Database**: PostgreSQL
- **ORM**: Spring Data JPA with Hibernate
- **Security**: Spring Security with JWT
- **Mapping**: MapStruct
- **Build Tool**: Maven

## Prerequisites

- Java 21 or higher
- Maven 3.6+
- Docker and Docker Compose (for database)

## Setup

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd BlogApp
   ```

2. Start the PostgreSQL database:
   ```bash
   docker-compose up -d
   ```

   This will start:
   - PostgreSQL on port `54321`
   - Adminer (database management UI) on port `8888`

3. Configure the application:
   - Database connection settings are in `src/main/resources/application.properties`
   - JWT secret is configured in the same file (update for production)

## Running the Application

Run the application using Maven:
```bash
./mvnw spring-boot:run
```

Or using the Maven wrapper on Windows:
```bash
mvnw.cmd spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

### Authentication
- `POST /api/auth/register` - Register a new user
- `POST /api/auth/login` - Login and receive JWT token

### Posts
- `GET /api/posts` - Get all posts
- `GET /api/posts/{id}` - Get a specific post
- `POST /api/posts` - Create a new post (requires authentication)
- `PUT /api/posts/{id}` - Update a post (requires authentication)
- `DELETE /api/posts/{id}` - Delete a post (requires authentication)

### Categories
- `GET /api/categories` - Get all categories
- `GET /api/categories/{id}` - Get a specific category
- `POST /api/categories` - Create a new category (requires authentication)
- `PUT /api/categories/{id}` - Update a category (requires authentication)
- `DELETE /api/categories/{id}` - Delete a category (requires authentication)

### Tags
- `GET /api/tags` - Get all tags
- `GET /api/tags/{id}` - Get a specific tag
- `POST /api/tags` - Create a new tag (requires authentication)
- `PUT /api/tags/{id}` - Update a tag (requires authentication)
- `DELETE /api/tags/{id}` - Delete a tag (requires authentication)

## Database Management

Access the Adminer interface at `http://localhost:8888` to manage the database:
- **Server**: `localhost`
- **Username**: `postgres`
- **Password**: `ThisIsNotARealPassword`
- **Database**: `postgres`

## Testing

Run tests with Maven:
```bash
./mvnw test
```

## Project Structure

```
src/main/java/com/codehex/blogapp/
├── BlogAppApplication.java       # Main application entry point
├── config/                       # Configuration classes
├── controllers/                  # REST controllers
├── domain/
│   ├── entities/                # JPA entities
│   └── dtos/                    # Data transfer objects
├── mappers/                     # MapStruct mappers
├── repositories/                # JPA repositories
├── security/                    # Security configuration
└── services/                    # Business logic
```

## License

This project is licensed under the terms specified in the license file.
