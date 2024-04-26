package com.day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        WebDriver driver=new ChromeDriver();
        driver.get("http://dbankdemo.com/bank/home");
    }
    {
        System.out.println( "Hello World!" );
    }
}
