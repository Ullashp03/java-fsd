package com.ex;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws InterruptedException, IOException
	{
		//register the webdriver =>browser vendor 
		WebDriverManager.chromedriver().setup();
		//creating an object to the object
		WebDriver wd=new ChromeDriver();
		//maximize the browser
		wd.manage().window().maximize();

		//webpage timebound 

		// wd.manage().timeouts().pageLoadTimeout(1,TimeUnit.MILLISECONDS);

		//go to browser and open this url 
		wd.get("https://www.ilovepdf.com/pdf_to_word");
		//pickfiles
		wd.findElement(By.id("pickfiles")).click();
		
		Runtime.getRuntime().exec("F:\\UploadFile.exe");
		
		Thread.sleep(2000);
		wd.findElement(By.id("processTask")).click();
		//wd.close();
		
	}
}
