package com.testng;

import org.testng.annotations.*;

public class GroupsExample {
	@BeforeGroups(value = "reg")
	
	@Test(groups = "somke")
	public void tc1()  {  
	System.out.println("Test Case 1");  
	}  
	@Test(groups = "reg") 
	public void tc2()  {  
	System.out.println("Test Case 2");  
	}  
	@Test(groups = "somke") 
	public void tc3()  {  
	System.out.println("Test Case 3");  
	}  
	@Test(groups = "reg") 
	public void tc4()  {  
	System.out.println("Test Case 4");  
	} 
	@Test(groups = "somke")
	public void tc5()  {  
	System.out.println("Test Case 5");  
	} 
}
