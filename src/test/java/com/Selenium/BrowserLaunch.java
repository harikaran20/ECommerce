package com.Selenium;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(3000);
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mob.click();
		Thread.sleep(3000);
		WebElement mobAcc = driver.findElement(By.xpath("//span[text()='Mobile Accessories']"));
		mobAcc.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,-500)");

	        Thread.sleep(2000);

		WebElement sounceClick = driver.findElement(By.xpath("(//span[text()='Sounce'])[2]"));
		sounceClick.click();
		
		
		//driver.quit();
		
	}

}
