package com.Selenium;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement email = driver.findElement(By.id("email")); 
		////input[@name='email']   //input[@id='email'] //input[@placeholder='Email address or phone number']
		//email.sendKeys("harikaransrinivasan17@gmail.com");
		//WebElement password = driver.findElement(By.name("pass"));
		//password.sendKeys("123");
		//WebElement loginBtn = driver.findElement(By.name("login"));
	//	loginBtn.click();
		//String currentUrl = driver.getCurrentUrl();
	//	System.out.println(currentUrl);
		//String title = driver.getTitle();
	//	System.out.println(title);
		
		WebElement creAcc = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		creAcc.click();
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Harikaran");
		
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Srinivasan");
		
	}

}
