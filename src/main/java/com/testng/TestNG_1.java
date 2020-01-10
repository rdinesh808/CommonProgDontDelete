package com.testng;

import org.testng.annotations.*;

public class TestNG_1 {
	
	@BeforeSuite
	public void bsuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void bclass() {
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void btest() {
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void bmethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void tc1() {
		System.out.println("Test");
	}
	

}
