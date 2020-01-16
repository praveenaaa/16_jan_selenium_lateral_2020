package com.maven_demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_drop_actions {
WebDriver driver;
	@BeforeTest
	public void launch_Browser() {
	

	System.setProperty("webdriver.chrome.driver", "C://driver9999//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://jqueryui.com/droppable/");
	String str5=  driver.getTitle();
	System.out.println(str5);
	
	}
	@Test 
	
	public void actions_demo2(){
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement tgt=driver.findElement(By.id("droppable"));
		Actions act= new Actions(driver);
		
		act.dragAndDrop(src,tgt).build().perform();
		
		
	}
}
