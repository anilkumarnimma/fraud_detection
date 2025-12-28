**Fraud Detection API – Spring Boot**

This is a simple backend project built using Spring Boot.
The API takes a transaction amount and checks whether it should be
considered fraudulent based on a basic rule.

I built this project to understand how REST APIs work in Spring Boot
and to practice writing clean backend code with proper structure.

---

**What this project does**
- Accepts a transaction amount as input
- Applies a fraud check rule
- Returns whether the transaction is fraud or not

This is a small project, but it helped me understand how real backend
applications are structured.

---

**Technologies Used**
- Java
- Spring Boot
- Maven
- REST APIs
- Postman
- Git & GitHub

---

**Project Structure**
The code is organized in a simple and clean way:

**controller** – handles API requests
**service** – contains the fraud checking logic
**model** – holds data objects

This separation makes the code easy to understand and maintain.

---

**How to Run the Project**
1. Open the project in IntelliJ
2. Run `FraudDetectionApplication`
3. The application will start on port `8080`

---

**API Usage**

**Check Fraud**
**POST** `/api/fraud/check`

**Request Body**
```json
{
  "amount": 15000
}
