package com.test.result;
import org.testng.ITestResult;
import org.testng.annotations.Test;
public class Result {	
    public void onTestSkipped(ITestResult Result){		
    System.out.println("The name of the testcase Skipped is :"+Result.getName());					
    }
}
