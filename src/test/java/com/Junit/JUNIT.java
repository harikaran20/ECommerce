package com.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUNIT {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");

	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");

	}
	@Test
	public void login() {
		System.out.println("Login method");
		

	}
	@Before
	public void bef() {
		System.out.println("Browser Launch");

	}
	@After
	public void aft() {
		System.out.println("Browser Close");

	}
	public void ign() {
		System.out.println("ign method");

	}
	
	

}
