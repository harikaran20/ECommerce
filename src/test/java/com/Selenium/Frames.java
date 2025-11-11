package com.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/javatraininginchennaiomr");;
		driver.manage().window().maximize();
		driver.switchTo().frame("java-content");
   		WebElement text = driver.findElement(By.xpath("//h4[contains(text(),'Have Fun While You Learn')]"));
   		String text2 = text.getText();
   		System.out.println(text2);
   		text.click();
   		driver.switchTo().defaultContent();
		
	}

}
