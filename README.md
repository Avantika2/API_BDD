# 🚀 Login API Automation Framework

This project is a simple Java-based API test automation framework that verifies the login functionality of an API using:

- 🧪 **TestNG**
- 🌿 **Cucumber (BDD)**
- 🔥 **RestAssured**
- 🐘 **Maven**
- 
## 📌 Project Objective

Automate the testing of a **Login API** by simulating login requests with different credentials and validating the response status codes.

📂 Project Structure
LoginApiTestProject/
│
├── src/
│   └── test/
│       └── java/
│           ├── FeatureFiles/
│           │   └── Feature.feature         # 💡 Cucumber feature file with scenarios
│           │
│           └── StepDefinations/
│               ├── ApiUtils.java           # 🔧 Utility class for API setup and requests
│               ├── LoginTest.java          # 📋 Step definitions mapped to Gherkin steps
│               └── TestRunner.java         # 🚦 Cucumber TestNG runner class
│
├── testng.xml                              # 🧪 TestNG configuration file
├── pom.xml                                 # ⚙️ Maven dependencies and build config
└── README.md                               # 📘 Project overview (this file)

🛠 Technologies Used
✅ Java

✅ Maven

✅ Cucumber (BDD)

✅ TestNG

✅ RestAssured for API testing

▶️ How to Run the Tests
🧰 Prerequisites
Java 17 or later
Maven installed
Internet connection to download dependencies

🚀 Run with Maven
mvn clean test

📊 Reporting
✅ TestNG Reports
TestNG automatically generates reports under:
target/surefire-reports/

📥 Sample Responses
Username	Password	Status	Meaning
Avan	    Password	 200    ✅Login success
Avan123	  Passwordd	 401    ❌Login failed
