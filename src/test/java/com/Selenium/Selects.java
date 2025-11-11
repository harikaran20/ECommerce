package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selects {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement couList = driver.findElement(By.id("country-list"));
		Select sel = new Select(couList);
		sel.selectByIndex(7);
		
		//Print count of the options
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		System.out.println(size);
		
		//Print the 25th index option
		WebElement element = options.get(25);
		String text = element.getText();
		System.out.println(text);
		
		
		List<WebElement> options2 = sel.getOptions();
		for (int i = 0; i < options2.size(); i++) {
			WebElement output = options2.get(i);
			String text2 = output.getText();
			System.out.println(text2);
			
		}
		
	}

}
