package com.maven_demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_demo1 {
  @Test
  public void login() { System.out.println(" i m in login test ");
  }
  
  @Test
  public void registeration(){
	  System.out.println(" i m in registration test ");
  }
  @BeforeMethod
  public void beforeMethod() {System.out.println(" i m in @BeforeMethod ");
  }

  @AfterMethod
  public void afterMethod() {System.out.println(" i m in @AfterMethod ");
  }

  @BeforeClass
  public void beforeClass() {System.out.println(" i m in @BeforeClass ");
  }

  @AfterClass
  public void afterClass() {System.out.println(" i m in  @AfterClass ");
  }

  @BeforeTest
  public void beforeTest() {System.out.println(" i m in @BeforeTest ");
  }

  @AfterTest
  public void afterTest() {System.out.println(" i m in  @AfterTest ");
  }

  @BeforeSuite
  public void beforeSuite() {System.out.println(" i m in @BeforeSuite ");
  }

  @AfterSuite
  public void afterSuite() {System.out.println(" i m in @AfterSuite ");
  }

}
