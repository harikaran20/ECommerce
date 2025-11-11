package com.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {
	 static WebDriver driver;
	 @BeforeClass
	 public  static void broswerLaunch() {
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
	}
	 @AfterClass
	 public static void browserClose() {
		 driver.close();

	}
	 @Test
	 public void login() {
		 WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys("one@gmail.com");
		 WebElement pass = driver.findElement(By.name("pass"));
		 pass.sendKeys("one123");
		 WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		 login.click();
		 

	}
	 @Before
	 public void bef() {
		 long timeMillis = System.currentTimeMillis();
		 System.out.println(timeMillis);

	}
	 @After
	 public void aft() {
		 long timeMillis = System.currentTimeMillis();
		 System.out.println(timeMillis);

	}
	 
	 
}
