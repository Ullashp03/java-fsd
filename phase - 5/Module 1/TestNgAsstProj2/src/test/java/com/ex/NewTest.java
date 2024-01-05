package com.ex;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {

    WebDriver driver;
    @Test(groups="Chrome")
    public void LaunchChrome() {
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe/");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(groups="Chrome", dependsOnMethods="LaunchChrome")
    public void TryFacebook1() {
        System.out.println(Thread.currentThread().getId());
        driver.findElement(By.id("email")).sendKeys("ullas@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("12345");
        driver.findElement(By.id("loginbutton")).click();
    }
    
    @Test(groups="Firefox")
    public void LaunchFirefox() {
        System.setProperty("webdriver.gecko.driver", "D:/geckodriver-v0.34.0-win32/geckodriver.exe/");
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    @Test(groups="Firefox", dependsOnMethods="LaunchFirefox")
    public void TryFacebook2() {
        System.out.println(Thread.currentThread().getId());
        driver.findElement(By.id("email")).sendKeys("ullas@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("ullas28394");
        driver.findElement(By.id("loginbutton")).click();
        System.out.println(Thread.currentThread().getId());
    }
}
