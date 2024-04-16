package com.pah.locator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.tomcat.util.http.fileupload.FileUtils;
//import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.joran.action.Action;

@SpringBootApplication
public class LocatorApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driverchrome=new ChromeDriver();
		driverchrome.get("https://magento.softwaretestingboard.com/");
		 driverchrome.findElement(By.id("search")).click();
		driverchrome.findElement(By.id("search")).sendKeys("shoes");
		driverchrome.findElement(By.xpath("//*[@id='search_mini_form']/div[2]/button")).click();
		if(driverchrome.findElement(By.xpath("//*[@id='maincontent']/div[1]/h1/span")).getText().contains("shoes"))
		{
			System.out.print("content is available");
		}
		else
		System.out.print("not available");
		TakesScreenshot s=(TakesScreenshot)driverchrome;
		File file=s.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("./.screenshot/shoes.png"));
		Thread.sleep(1000);
		 WebElement chrome=driverchrome.findElement(By.xpath("//*[@id='ui-id-5']/span[1]"));
		 Actions driver=new Actions(driverchrome);
		 driver.moveToElement(chrome).perform();
		 WebElement chrom=driverchrome.findElement(By.xpath("//*[@id='ui-id-17']/span[1]"));
		//  Actions dr=new Actions(driverchrome) ;
		 driver.moveToElement(chrom).perform();
		SpringApplication.run(LocatorApplication.class, args);
	}

}
