package com.maven_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hello_selenium {

	//public static void main(String[] args) throws Exception {
	@Test
	public void rediff_login() throws Exception{
		System.out.println("hello selenium wake up ");
		System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("login")).sendKeys("pravin");
		driver.findElement(By.id("password")).sendKeys("pravin918");
		//driver.findElement(By.name("proceed")).click();
		//driver.findElement(By.xpath("//form/div[2]/div[6]/div[1]/input")).click();
		// /html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div[2]/div[6]/div[1]/input
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div[2]/div[6]/div[1]/input")).click();
		
		

	}

}
