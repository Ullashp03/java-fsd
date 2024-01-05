package com.ex;

import java.awt.Container;
import java.awt.Font;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
       WebDriverManager.chromedriver().setup();
       
       WebDriver wd = new ChromeDriver();
       
       wd.manage().window().maximize();
       
       wd.get("https://www.ilovepdf.com/login");
       
       Thread.sleep(2000);
       
     //  Tag and ID
       wd.findElement(By.cssSelector("href#inputPasswordAuth")).click();
       
     //  Tag and Class
       wd.findElement(By.cssSelector("input.input")).click();
       
     //  Tag and Attribute
       wd.findElement(By.cssSelector("input[name=LoginForm[email]")).click();
       
     //  Tag, Class and Attribute
       wd.findElement(By.cssSelector("input.input[name=LoginForm[password]]")).click(); 
         
     //  inner text 
       wd.findElement(By.cssSelector(Font:Contain("Forgot your password?"))).click();  
    }
}
