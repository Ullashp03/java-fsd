package com.ex;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class NewTest {
	WebDriver wd;
  @Test
  public void oracle() throws InterruptedException {
		
	  wd.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
	  wd.manage().window().maximize();
		Thread.sleep(1000);
		WebElement email= wd.findElement(By.id("sView1:r1:0:email::content"));
		email.sendKeys("ullashp40@gmail.com");
		Thread.sleep(1000);
		WebElement pass= wd.findElement(By.id("sView1:r1:0:password::content"));
		pass.sendKeys("Ullas@1234");
		Thread.sleep(1000);
		WebElement repass= wd.findElement(By.id("sView1:r1:0:retypePassword::content"));
		repass.sendKeys("Ullas@1234");
		Thread.sleep(1000);
		WebElement country= wd.findElement(By.id("sView1:r1:0:country::content"));
		country.sendKeys("India");
		WebElement fname= wd.findElement(By.id("sView1:r1:0:firstName::content"));
		fname.sendKeys("Ullas");
		Thread.sleep(1000);
		WebElement lname= wd.findElement(By.id("sView1:r1:0:lastName::content"));
		lname.sendKeys("H P");
		Thread.sleep(1000);
		WebElement jobtitle= wd.findElement(By.id("sView1:r1:0:jobTitle::content"));
		jobtitle.sendKeys("ASE");
		Thread.sleep(1000);
		WebElement phone= wd.findElement(By.id("sView1:r1:0:workPhone::content"));
		phone.sendKeys("987654321");
		Thread.sleep(1000);
		WebElement compname= wd.findElement(By.id("sView1:r1:0:companyName::content"));
		compname.sendKeys("ABC");
		Thread.sleep(1000);
		WebElement address= wd.findElement(By.id("sView1:r1:0:address1::content"));
		address.sendKeys("DEF Tech Park, GHI");
		Thread.sleep(1000);
		WebElement city= wd.findElement(By.id("sView1:r1:0:city::content"));
		city.sendKeys("Bengaluru");
		Thread.sleep(1000);
		WebElement state= wd.findElement(By.id("sView1:r1:0:state::content"));
		state.sendKeys("Karnataka");
		Thread.sleep(1000);
		WebElement postalcode= wd.findElement(By.id("sView1:r1:0:postalCode::content"));
		postalcode.sendKeys("560090");
		Thread.sleep(1000);
		WebElement register= wd.findElement(By.cssSelector("#sView1\\:r1\\:0\\:b1"));
		register.click();
		
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe/");
		wd= new ChromeDriver();
	}
	@AfterMethod
	public void afterMethod() {
		//driver.close()
		wd=null;
	}
	
}
