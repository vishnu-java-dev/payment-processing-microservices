# payment-processing-microservices
Enterprise-level Gradle multi-module microservices project with Circuit Breaker and Resilience4j

A production-style microservices architecture built using Spring Boot, Spring Cloud, and Gradle.

This project demonstrates real-world backend concepts including:

- Microservices Architecture
- Service Discovery (Eureka)
- API Gateway
- Inter-service Communication (Feign Client)
- Circuit Breaker (Resilience4j)
- Docker Containerization
- Multi-module Gradle Setup

---

## 🏗️ Architecture Overview

Client → API Gateway → Order Service → Payment Service  
                      ↓  
                 Eureka Server

---

## 📦 Services Included

### 1️⃣ discovery-service
- Eureka Server
- Service registry
- Runs on port **8761**

Dashboard:
---

### 2️⃣ api-gateway
- Spring Cloud Gateway
- Routes external requests to internal services
- Runs on port **8080**

---

### 3️⃣ order-service
- Handles order creation
- Communicates with payment-service using Feign Client
- Implements Circuit Breaker pattern

Runs on port **8081**

---

### 4️⃣ payment-service
- Handles payment processing
- Simulates payment success/failure

Runs on port **8082**

---

## ⚙️ Tech Stack

- Java 21
- Spring Boot 4.0.3
- Spring Cloud 2025
- Gradle (Multi-module)
- Eureka (Service Discovery)
- Spring Cloud Gateway
- OpenFeign
- Resilience4j (Circuit Breaker)
- Docker & Docker Compose

---
