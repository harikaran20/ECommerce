package com.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.greenstechnologys.com/");
		WebElement onlineCou = driver.findElement(By.xpath("//a[contains(text(),'Online Courses')]"));
		Actions a = new Actions(driver);
		a.moveToElement(onlineCou).perform();
		WebElement sofTest = driver.findElement(By.xpath("//a//span[text()='Software Testing']"));
		sofTest.click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
	}

}
