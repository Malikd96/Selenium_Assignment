# Selenium Assignment

## Purpose
This project uses Selenium WebDriver to automate the browser and validate basic web page functionality.

## What the Script Does
- Opens the Chrome browser
- Navigates to https://www.wikipedia.org
- Verifies that the page title contains "Wikipedia"
- Takes a screenshot of the homepage and saves it as `homepage.png`
- Closes the browser

## How to Run
1. Clone the repository.
2. Make sure you have Java, Maven, Selenium, and ChromeDriver installed.
3. Run the following command:
   ```bash
   mvn clean compile exec:java -Dexec.mainClass="com.saint.BasicSeleniumTest"

# ✅ Hello_World_Selenium_Project

### Author: Malik Davis  
### Date: April 23, 2025

---

## 🧪 Project Overview
This is a complete Selenium automation framework built using **Java**, **Maven**, **TestNG**, and **Apache POI**. It demonstrates browser automation, form interactions, data-driven testing with Excel, and proper test structuring with TestNG.

---

## 📁 Project Structure


---

## ⚙️ Tools & Dependencies

- Java 17
- Maven 3.9.6
- Selenium 4.8.0
- TestNG 7.4.0
- Apache POI 5.2.3

---

## 📌 Key Components

### 1. `BasicAutomation.java`
- Opens Wikipedia in the browser.
- Verifies the page title.
- Takes a screenshot.

### 2. `AdvancedAutomation.java`
- Demonstrates dropdown, checkbox, radio button, and alert handling.
- Uses implicit and explicit waits.

### 3. `TestAutomationTest.java`
- Implements TestNG annotations (`@BeforeMethod`, `@Test`, `@AfterMethod`).
- Generates structured test reports.

### 4. `DataDrivenTest.java`
- Reads data from `testdata.xlsx`.
- Performs multiple searches based on Excel data and prints result titles.

---

## 🧠 What I Learned

- How to automate browser workflows using Selenium WebDriver.
- Proper project setup and dependency management using Maven.
- Dynamic test case execution using Apache POI and Excel data.
- Test structuring and reporting with TestNG.

---

## 🔧 Challenges Faced

- Java version and environment conflicts.
- TestNG annotations not found (fixed with correct Maven dependency).
- Apache POI errors due to invalid file location or format.
- ChromeDriver CDP issues (browsers updated & security settings adjusted).

---

## ✅ Status

All tasks and classes were executed successfully:
- Excel integration verified ✅  
- TestNG tests passed ✅  
- Screenshots captured ✅  
- Project builds with no errors ✅

---

> 💡 Tip: To run this project, use `mvn clean compile exec:java -Dexec.mainClass="com.saint.ClassName"` or `mvn test` for TestNG classes.



🚀 How to Run
Clone the repo

git clone https://github.com/YOUR_USERNAME/Hello_World_Selenium_Project.git
cd Hello_World_Selenium_Project
Add testdata.xlsx in the root of the project if not already present.

Run the automation scripts

mvn clean compile exec:java -Dexec.mainClass="com.saint.BasicAutomation"
mvn clean compile exec:java -Dexec.mainClass="com.saint.AdvancedAutomation"
mvn clean compile exec:java -Dexec.mainClass="com.saint.DataDrivenTest"
Run TestNG tests
mvn test
