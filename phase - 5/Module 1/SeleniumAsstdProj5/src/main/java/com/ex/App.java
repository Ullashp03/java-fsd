package com.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

    public static void main(String[] args) throws InterruptedException {
      WebDriverManager.chromedriver().setup();

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        try {
            // Handling Alerts
            driver.get("https://www.google.com");
            
            // Clicking on 'OK' button in the alert
            driver.switchTo().alert().accept();

            // Clicking on 'Cancel' button in the alert
            driver.switchTo().alert().dismiss();

            // Capturing the alert message
            String alertMessage = driver.switchTo().alert().getText();
            System.out.println("Alert Message: " + alertMessage);
            Thread.sleep(2000);
            // Entering information in the alert
            driver.switchTo().alert().sendKeys("Text");

            // Exiting from the alert
            driver.switchTo().alert().accept();
            Thread.sleep(2000);
            // Handling New Tabs
            driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
            // Perform operations in the new tab
            driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

            // Handling New Windows
            driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "n");
            // Perform operations in the new window
            driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
