package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://omrbranch.com/seleniumtraininginchennaiomr");
		WebElement str = driver.findElement(By.xpath("//a[contains(text(),' String ')]"));	
		
		WebElement strDes = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(str, strDes).perform();
		
		
		
		WebElement lis = driver.findElement(By.xpath("//a[contains(text(),' List ')]"));
		
		WebElement lisDes = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(lis, lisDes).perform();
		
		WebElement act = driver.findElement(By.xpath("//a[contains(text(),' Actions ')]"));
		
		WebElement actDes = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		a.dragAndDrop(act, actDes).perform();
		
		WebElement webdri = driver.findElement(By.xpath("//a[contains(text(),' Webdriver ')]"));
		
		WebElement webdriDes = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		a.dragAndDrop(webdri, webdriDes).perform();
		
		WebElement output = driver.findElement(By.xpath("//a[contains(text(),'Succesfully Matched!')]"));
		String text = output.getText();
		System.out.println(text);
		
		
		
		
		
		
		
	}

}
