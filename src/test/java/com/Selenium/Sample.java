package com.Selenium;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	String PageTitle = driver.getTitle();
	System.out.println(PageTitle);
	String pageSource = driver.getPageSource();
	//System.out.println(pageSource);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	//driver.close();
		

	
	
	}
}
