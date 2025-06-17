# 👩‍💼 Employee Management System – Spring Boot + Thymeleaf Project

A full-stack **Employee Management System** built using **Spring Boot** and **Thymeleaf**. This application allows users to **add** and **list employee details**, with all **HTTP requests logged** via a custom **Spring Interceptor**.

---

## 🎯 Objective

Design and implement an employee management application that performs the following:

- Add employee via HTML form or JSON.
- View employee list using Thymeleaf.
- Log each HTTP request (method + URI).
- Load all employee data on application startup.

---

## 🧰 Technologies Used

- Java 8+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

---

## 🗃️ Database Schema

Create your MySQL database and table using the following DDL:

```sql
CREATE DATABASE employee_management;
USE employee_management;

CREATE TABLE employee (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  department VARCHAR(100),
  salary DECIMAL(10,2),
  date_of_joining DATE
);
```

---

## ⚙️ Configuration

In src/main/resources/application.properties, configure your DB credentials:
```
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.thymeleaf.cache=false
server.port=8080
```
---

## 🧱 Project Structure
```
src/main/java/com/example/employeemanagementsystem/
├── controller/
│   └── EmployeeController.java
├── service/
│   ├── EmployeeService.java
│   └── EmployeeServiceImpl.java
├── repository/
│   └── EmployeeRepository.java
├── model/
│   └── Employee.java
├── dto/
│   └── EmployeeDto.java
├── interceptor/
│   └── LoggingInterceptor.java
├── config/
│   └── WebConfig.java
└── EmployeeManagementSystemApplication.java

src/main/resources/
├── templates/
│   ├── employee-form.html
│   └── employee-list.html
└── application.properties
```

---

## 🚀 Running the Application

- Clone or copy the project files.
- Update DB config in application.properties.
- Ensure MySQL is running and database is created.
- Run the app:
```
./mvnw spring-boot:run
Or build and run:
mvn clean install
java -jar target/EmployeeManagementSystem-0.0.1-SNAPSHOT.jar
```

---

## 🌐 Endpoints

Method	Endpoint	Description
```
GET	/employees/v1/view	Render employee list via Thymeleaf
GET	/employees/v1/add	Show form to add employee
POST	/employees/v1/add	Submit form to add employee
POST	/employees/add	Add employee via JSON (API)
GET	/employees/view	View all employees as JSON (API)
```
---

## 🧪 Testing the API

### 🔸 POST employee via JSON:
```
curl -X POST http://localhost:8080/employees/add \
  -H "Content-Type: application/json" \
  -d '{"name":"Alice","department":"HR","salary":60000,"dateOfJoining":"2023-04-01"}'
```

### 🔸 View employees via browser:
```
Thymeleaf view: http://localhost:8080/employees/v1/view
API view: http://localhost:8080/employees/view
```

---

## 📌 Screenshots 


---

## 📄 License
This project is for educational and demonstration purposes.

---

## ✨ Features
Add employee via HTML form (Thymeleaf)

View employee list in a styled HTML table

API support for POSTing and listing employees (JSON)

Logs every HTTP request (method and URI)

Interceptor registered via @Configuration

🧠 Learning Outcomes
Understand Spring Boot layered architecture
