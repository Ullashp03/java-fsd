package com.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe/");
		WebDriver wd= new ChromeDriver();
		wd.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		wd.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement email = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content"));
		email.sendKeys("Ullashp40@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content"));
		password.sendKeys("Ullas@1234");
		Thread.sleep(1000);
		
		WebElement repassword = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:retypePassword\\:\\:content"));
		repassword.sendKeys("Ullas@1234");
		Thread.sleep(1000);
		
		WebElement country = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:country\\:\\:content"));
		country.sendKeys("India");
		
		WebElement firstname = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:firstName\\:\\:content"));
		firstname.sendKeys("Ullas");
		
		WebElement lastname = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content"));
		lastname.sendKeys("H P");
		
		WebElement jobTitle = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:jobTitle\\:\\:content"));
		jobTitle.sendKeys("ASE");
		
		WebElement workPhone = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:workPhone\\:\\:content"));
		workPhone.sendKeys("987654321");
		
		WebElement companyName = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:companyName\\:\\:content"));
		companyName.sendKeys("ABC");
		
		WebElement address = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:address1\\:\\:content"));
		address.sendKeys("DEF Tech Park, GHI");
		
		WebElement city = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:city\\:\\:content"));
		city.sendKeys("Bengaluru");
		
		WebElement state = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:state\\:\\:content"));
		state.sendKeys("Karnataka");
		
		WebElement pinCode = wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:postalCode\\:\\:content"));
		pinCode.sendKeys("560090");
		
		Thread.sleep(1000);
		WebElement register= wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:b1"));
		register.click();
	}

}