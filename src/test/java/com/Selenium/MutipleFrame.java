package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleFrame {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement fra = driver.findElement(By.xpath("//iframe[@src='https://omrbranch.com/public/html/automation.html']"));
		driver.switchTo().frame(fra);
		
		WebElement aut = driver.findElement(By.xpath("//h2[contains(text(),'Automation')]"));
		String text = aut.getText();
		System.out.println(text);
		
		WebElement corJav = driver.findElement(By.name("core-java"));
		driver.switchTo().frame(corJav);
		WebElement cjText = driver.findElement(By.xpath("//h4[text()='Core Java']"));
		String text2 = cjText.getText();
		System.out.println(text2);	
		
		WebElement oop = driver.findElement(By.id("oops"));
		driver.switchTo().frame(oop);
		WebElement oopTex = driver.findElement(By.xpath("//p[text()='1.1 OOPS']"));
		String text3 = oopTex.getText();
		System.out.println(text3);	
		
		driver.switchTo().parentFrame();
		System.out.println(text2);	
		driver.switchTo().parentFrame();
		System.out.println(text);
		driver.switchTo().defaultContent();
		

		
		
		
		
	}

}
