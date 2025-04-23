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
