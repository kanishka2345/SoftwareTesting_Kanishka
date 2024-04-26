package com.day8;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    WebDriver driver;
    String username, password;

    @Before
    public void beforeTest() throws IOException {
        // Initialize WebDriver
        driver = new ChromeDriver();

        // Load Excel file
        FileInputStream fis = new FileInputStream("C:\\Users\\kanis\\OneDrive\\Desktop\\software classwork\\day8\\day8\\src\\Excelsheet\\data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // Get the "Login" sheet
        XSSFSheet sheet = workbook.getSheet("Login");

        // Read username and password from Excel
        XSSFRow row = sheet.getRow(1);
        username = row.getCell(0).getStringCellValue();
        password = row.getCell(1).getStringCellValue();

        // Close the workbook
        workbook.close();

        // Open the web page
        driver.get("https://dbankdemo.com/bank/home");
    }

    @Test
    public void testLogin() {
        // Enter username and password
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        // Click on submit button
        driver.findElement(By.id("submit")).click();

        // Assertion (You might want to add a proper assertion based on your scenario)
        assertTrue(true);
    }

    @After
    public void afterTest() {
        // Wait for a few seconds before closing the browser
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
