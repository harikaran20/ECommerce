package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement curDate = driver.findElement(By.xpath("//button[text()='Click to see current date']"));
		curDate.click();
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		WebElement dClick = driver.findElement(By.xpath("//button[text()='Double click to see future date']"));
		Actions a = new Actions(driver);
		a.doubleClick(dClick).perform();
		al.accept();
		a.doubleClick(dClick).perform();
		al.dismiss();

		WebElement pro = driver.findElement(By.xpath("//button[text()='Right click to enter past date']"));
		a.contextClick(pro).perform();
		al.sendKeys("Yes");
		al.accept();
		driver.close();
		
		
		
		
		
		
	}

}
