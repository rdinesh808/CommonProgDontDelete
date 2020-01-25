package com.extendsreportexamp;

import java.io.File;
import java.util.Date;
import org.testng.annotations.*;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportExamp {
	ExtentReports report;
	ExtentTest test;
	@BeforeSuite
	public void initials() throws Exception{
		String desc = "<font color='red'><b>DINESH<b><br>"
				      + "Extents Report Description </font>";
		Date d = new Date();
		String s1 = d.toString().replace(":", "_").replace("-", "_")+".html";
		report = new ExtentReports(System.getProperty("user.dir")+"\\HTMLReport\\"+s1,true,DisplayOrder.NEWEST_FIRST);
		report.loadConfig(new File("E:\\STS-Workspace\\CommonProgramFileRead\\LogoAdd\\LogoReport.xml"));
		test = report.startTest("LOGO add in Extents Report..",desc);
	}
	@Test
	public void tc1(){
		test.log(LogStatus.ERROR, "ERROE");
		test.log(LogStatus.FAIL, "FAIL");
		test.log(LogStatus.FATAL, "FATAL");
		test.log(LogStatus.INFO, "INFO");
		test.log(LogStatus.PASS, "PASS");
		test.log(LogStatus.SKIP, "SKIP");
		test.log(LogStatus.UNKNOWN, "UNKNOWN");
		test.log(LogStatus.WARNING, "WARNING");
	}
	@AfterSuite
	public void finishs(){
		report.endTest(test);
		report.flush();
		System.out.println("Success...");
	}
}
