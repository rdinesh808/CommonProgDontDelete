package com.testng;

import java.lang.reflect.Method;
import java.util.*;

import org.testng.annotations.*;

public class GetMethodName {
//	Method method;
//	public void one() {
//		System.out.println("METHOD..");
//	}
//	@Test
//	public void nameBefore(Method method) {
//		this.method = method;
//	    System.out.println("Test name: " + method.getName());       
//	}
	public static void main(String[] args) {
		List<String> listeners = new ArrayList<String>();
	    listeners.add(GetMethodName.class.getName());
	    //testSuite.setListeners(listeners);
	    System.out.println(listeners);
	}
}
