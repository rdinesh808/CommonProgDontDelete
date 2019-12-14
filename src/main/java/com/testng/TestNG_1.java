package com.testng;

import org.testng.annotations.Test;

public class TestNG_1 {
	
	@Test(invocationCount = 2)
	public void tc1(){
		int i = 1;
		System.out.println("Test Case = " + i);
		i++;
	}

}
