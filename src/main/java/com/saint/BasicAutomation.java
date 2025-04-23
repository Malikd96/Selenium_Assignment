package com.saint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutomation {
    public static void main(String[] args) {
        // Set path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");

        // Initialize browser
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Navigate to Wikipedia
            driver.get("https://www.wikipedia.org");

            // 2. Print page title
            String title = driver.getTitle();
            if (title.contains("Wikipedia")) {
                System.out.println("Title validation PASSED: " + title);
            } else {
                System.out.println("Title validation FAILED: " + title);
            }

            // 3. Interact with the search bar using different selectors

            // By ID
            WebElement searchInputById = driver.findElement(By.id("searchInput"));
            searchInputById.clear();
            searchInputById.sendKeys("Selenium WebDriver");

            // (Optional) Try another method if you want to experiment:
            // By Name
            // WebElement searchInputByName = driver.findElement(By.name("search"));
            // searchInputByName.sendKeys("Selenium WebDriver");

            // By XPath
            // WebElement searchInputByXPath = driver.findElement(By.xpath("//input[@id='searchInput']"));
            // searchInputByXPath.sendKeys("Selenium WebDriver");

            // By CSS Selector
            // WebElement searchInputByCss = driver.findElement(By.cssSelector("input#searchInput"));
            // searchInputByCss.sendKeys("Selenium WebDriver");

            // 4. Submit the search
            searchInputById.submit();

            // 5. Print the new page title
            Thread.sleep(2000); // Small wait for page load
            System.out.println("Results Page Title: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6. Close the browser
            driver.quit();
        }
    }
}
