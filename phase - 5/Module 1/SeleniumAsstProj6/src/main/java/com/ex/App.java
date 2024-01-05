package com.ex;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	 public static void main(String[] args ) throws IOException
	    {
		 System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe/");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	       WebElement upload = driver.findElement(By.xpath("//*[@type='text']"));
	       upload.click();
	       TakesScreenshot ts = (TakesScreenshot)driver;
	       File scr = ts.getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(scr, new File("D:/Screenshot/test.png"));
	       
	    }
}
