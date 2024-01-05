package com.ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class NewTest {      
        private WebDriver wd;   
        SoftAssert soft=new SoftAssert();
        @Test               
        public void testEasy() {    
        	 System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe/");
            wd=new ChromeDriver();
            wd.get("https://www.facebook.com");  
            String title = wd.getTitle();                
            soft.assertEquals("FB Login",title);        
        }   
        @BeforeTest
        public void beforeTest() {  
            wd = new FirefoxDriver();  
        }       
        @AfterTest
        public void afterTest() {
            wd.quit();          
        }       
}


