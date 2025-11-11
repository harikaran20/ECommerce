package com.Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectYes {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement skill = driver.findElement(By.id("skills"));
		Select sel = new Select(skill);
		sel.selectByIndex(3);
		
		List<WebElement> options = sel.getOptions();
		for (int i = 0; i < options.size(); i++) {
			sel.selectByIndex(i);
			
			
		}
		
		
		
		
		
	}

}
