package com.saint;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            // ✅ Load Excel file from src/main/resources
            FileInputStream fis = new FileInputStream("src/main/resources/testdata.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0); // Use first sheet

            // 🔁 Loop through rows (starting from row 1 to skip header)
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                XSSFRow row = sheet.getRow(i);
                String searchTerm = row.getCell(0).getStringCellValue();

                driver.get("https://www.google.com");
                WebElement searchBox = driver.findElement(By.name("q"));
                searchBox.sendKeys(searchTerm);
                searchBox.submit();

                Thread.sleep(2000); // ⏳ wait for results
                System.out.println("Searched for: " + searchTerm);
            }

            workbook.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // ✅ Clean up browser
        }
    }
}
