package com.Junit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class SS {
	

	    public static void main(String[] args) throws IOException {
	        // Set up WebDriver (e.g., ChromeDriver)
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a webpage
	        driver.get("https://www.google.com");

	        // Cast WebDriver to TakesScreenshot interface
	        TakesScreenshot ts = (TakesScreenshot) driver;

	        // Capture screenshot as a File
	        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

	        // Define destination path and save the screenshot
	        File destinationFile = new File("visible_screenshot.png");
	        FileUtils.copyFile(sourceFile, destinationFile);

	        System.out.println("Screenshot captured at: " + destinationFile.getAbsolutePath());

	        // Close the browser
	        driver.quit();
	    }
	}

