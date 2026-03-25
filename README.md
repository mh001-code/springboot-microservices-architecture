# springboot-microservices-architecture

Microservices architecture built with Java 17 and Spring Boot 3, featuring synchronous REST and asynchronous RabbitMQ communication between two independent services: **warehouse** and **storefront**.

This project was built as a hands-on challenge proposed by [DIO](https://www.dio.me/), going beyond the instructor's base code with independent technical decisions on architecture, messaging, and documentation.

---

## Services

### Warehouse Service
Manages product inventory.
- Product registration and updates
- Stock availability queries
- Async communication with Storefront via RabbitMQ

### Storefront Service
Manages the product listing and orders.
- Available product listing
- Order placement
- Sync communication with Warehouse via REST
- Async stock updates via RabbitMQ

---

## Communication

| Type | Technology | Description |
|------|-----------|-------------|
| Synchronous | HTTP REST | Storefront queries Warehouse for product availability |
| Asynchronous | RabbitMQ | Warehouse publishes stock update events to Storefront |

---

## Tech Stack

| Technology | Purpose |
|-----------|---------|
| Java 17 | Core language |
| Spring Boot 3 | Application framework |
| Spring Web | REST API |
| Spring Data JPA | Data persistence |
| RabbitMQ | Async messaging |
| PostgreSQL | Relational database |
| Docker & Docker Compose | Containerization |
| Lombok | Boilerplate reduction |
| OpenAPI / Swagger | API documentation |

---

## Running Locally

### Prerequisites
- Java 17+
- Docker & Docker Compose
- Maven

### 1. Clone the repository
```bash
git clone https://github.com/mh001-code/springboot-microservices-architecture.git
cd springboot-microservices-architecture
```

### 2. Start infrastructure (RabbitMQ + PostgreSQL)
```bash
docker-compose up -d
```

### 3. Run the Warehouse service
```bash
cd warehouse
mvn spring-boot:run
```

### 4. Run the Storefront service
```bash
cd storefront
mvn spring-boot:run
```

### 5. Access Swagger docs
- Warehouse: http://localhost:8081/swagger-ui.html
- Storefront: http://localhost:8082/swagger-ui.html

---

## Technical Decisions

- **RabbitMQ** for decoupling services — avoids tight coupling between warehouse and storefront
- **Clear separation of responsibilities** — each service owns its domain
- **Docker** for consistent local development environment
- **Swagger** for automatic API documentation

---

## Author

Márcio Henrique F. Gonçalves
[linkedin.com/in/marciohenrique-dev](https://www.linkedin.com/in/marciohenrique-dev)
