package com.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;

public class app2 {

    public static void main(String[] args) throws InterruptedException {
    	 WebDriverManager.chromedriver().setup();
         
         WebDriver driver = new ChromeDriver();
         
         driver.manage().window().maximize();
         
         driver.get("https://www.ilovepdf.com/login");
         
         Thread.sleep(2000);
        try {
            // Step 1.4.10: Frame
            // Switch from Top window to a frame by name or ID
            driver.switchTo().frame("iframe1");
            // Perform operations within the frame

            // Switch back to the Top window
            driver.switchTo().defaultContent();

            // Alternatively, switch to a frame by using the frame element
            WebElement frameElement = driver.findElement(By.id("frameId"));
            driver.switchTo().frame(frameElement);
            // Perform operations within the frame

            // Switch back to the Top window
            driver.switchTo().defaultContent();

            // Step 1.4.11: Switching Between Tabs
            // Open a new tab using Ctrl + t
            driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");

            // Get the handles of all tabs
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

            // Switch to the newly opened tab
            driver.switchTo().window(tabs.get(1));
            // Perform operations in the new tab

            // Switch back to the original tab
            driver.switchTo().window(tabs.get(0));
            // Perform operations in the original tab

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
