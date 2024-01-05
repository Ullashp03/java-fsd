package com.ex;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Test1() {
	  System.out.println("Test1 executed");
  }
  
  @Test
  public void Test2() {
	  System.out.println("Test2 executed");
  }
  
  @BeforeTest
  public void BeforeTest() {
	  System.out.println("Before test executed");
  }
  
  @AfterTest
  public void AfterTest() {
	  System.out.println("After test executed");
  }
  
  @BeforeMethod
  public void BeforeMethod() {
	  System.out.println("BeforeMethod executed");
  }
  
  @AfterMethod
  public void AfterMethod() {
	  System.out.println("AfterMethod executed");
  }
  
  @BeforeClass
  public void BeforeClass() {
	  System.out.println("BeforeClass executed");
  }
  
  @AfterClass
  public void AfterClass() {
	  System.out.println("After Class executed");
  }
}

