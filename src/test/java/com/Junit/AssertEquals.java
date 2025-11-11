package com.Junit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertEquals {

	   static WebDriver driver;

	    @Before
	    public void setUp() {
	        // Step 1: Setup ChromeDriver
	      //  WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();

	        // Step 2: Open browser and navigate
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");
	    }

	    @Test
	    public void verifyTitle() {
	        // Step 3: Get actual page title
	        String actualTitle = driver.getTitle();

	        // Step 4: Expected title
	        String expectedTitle = "Google";

	        // Step 5: Compare both using assertEquals
	        Assert.assertEquals("verify the title", expectedTitle, actualTitle);

	        System.out.println("✅ Test Passed! Title matched successfully.");
	    }

	    @After
	    public void tearDown() {
	        // Step 6: Close the browser
	        driver.quit();
	    }
	}



