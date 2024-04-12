package com.chrome.software;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoftwareApplication {

	public static void main(String[] args) {
		WebDriver driverchrome=new ChromeDriver();
		// WebDriver driveredge=new EdgeDriver();
		// WebDriver driverfirefox=new FirefoxDriver();

		// driverchrome.get("https://www.get.google.com");
		// driverchrome.close();
		// driveredge.get("https://www.google.com");
		// driveredge.close();
		// driverfirefox.get("https://www.google.com");
		// driverfirefox.close();
		// driver.get("https://www.google.com");
		// driver.manage().window().fullscreen();
		// / driver.findElement(By.id(null))

		driverchrome.get("https://www.shoppersstop.com/");
		System.out.println(driverchrome.getTitle());
	
	
		driverchrome.findElement(By.className("user-icon")).click();

		SpringApplication.run(SoftwareApplication.class, args);
	}

}
