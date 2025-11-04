package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTask {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
	}

}
