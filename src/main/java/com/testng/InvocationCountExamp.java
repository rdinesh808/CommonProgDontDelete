package com.testng;

import org.testng.annotations.Test;

public class InvocationCountExamp {
	int i = 1;
	@Test(invocationCount = 10,invocationTimeOut=5000)
	public void invocatcount1() {
		System.out.println("Value is : " + i);
		i++;
	}
}
