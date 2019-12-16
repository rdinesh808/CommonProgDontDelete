package com.selenium;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class HTTPCertificationHandle {
public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\computer003\\Downloads\\chromedriver_win32\\chromedriver (2).exe");
	
	ChromeOptions co = new ChromeOptions();
	co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	co.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	co.addArguments("--incognito");
	
	ChromeDriver driver = new ChromeDriver(co);
	
	driver.manage().deleteAllCookies();
	
	driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	
	//Screen Shorts
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date d = new Date();
	SimpleDateFormat sfd = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss-aa");
	String s5 = sfd.format(d);
	FileUtils.copyFile(file, new File("E:\\STS-Workspace\\CommonProgramFileRead\\ScreenShorts\\"+s5+".png"));
	
	Thread.sleep(10000);
	
	driver.quit();
}
}
