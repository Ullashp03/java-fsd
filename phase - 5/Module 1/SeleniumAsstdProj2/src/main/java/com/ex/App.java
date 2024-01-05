package com.ex;

import org.openqa.selenium.By;
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
        
       wd.findElement(By.id("pickfiles")).click();
        
       wd.findElement(By.className("tool__header__small")).click();
        
       wd.findElement(By.name("LoginForm[password]")).click();   
       
       wd.findElement(By.partialLinkText("Solid Documents")).click();
        
       wd.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
    
       wd.findElement(By.xpath("Select PDF file")).click();       
    
    }
    
    
}
