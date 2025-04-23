package com.saint;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvancedAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            // 1. Navigate to a demo page with dropdowns, checkboxes, etc.
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            // 2. Select from dropdown
            WebElement dropdown = driver.findElement(By.name("my-select"));
            Select select = new Select(dropdown);
            select.selectByVisibleText("Option 2");

            // 3. Check a checkbox
            WebElement checkbox = driver.findElement(By.name("my-check"));
            if (!checkbox.isSelected()) {
                checkbox.click();
            }

            // 4. Click a radio button
            WebElement radio = driver.findElement(By.cssSelector("input[value='option1']"));
            radio.click();

            // 5. Handle alert popup via JavaScript
            ((JavascriptExecutor) driver).executeScript("alert('This is an alert!')");
            Alert alert = driver.switchTo().alert();
            alert.accept();

            // 6. Open new tab and switch to it
            ((JavascriptExecutor) driver).executeScript("window.open('https://www.wikipedia.org', '_blank');");
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }

            System.out.println("Title in new tab: " + driver.getTitle());

            // 7. Use explicit wait to wait for a specific element
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement textField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("my-text")));
            textField.sendKeys("Selenium!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
