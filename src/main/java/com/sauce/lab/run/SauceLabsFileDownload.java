package com.sauce.lab.run;

import java.net.URL;
import java.util.*;
import java.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsFileDownload {
public static void main(String[] args) {
	final String USERNAME = "Dindj";
    final String ACCESS_KEY = "96685d26-4c24-46d6-b9e2-8f68caa1248a";
    final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
    String APP = System.getProperty("user.dir")+"/DownloadFile";
    
    DesiredCapabilities caps = new DesiredCapabilities();

	Map<String, Object> baseState = new HashMap<String, Object>();
	baseState.put("type", "NATIVE");
	baseState.put("executable", APP);
	baseState.put("locator", "//Window");

	caps.setCapability("appdriver-basestate", baseState);

	Map<String, Object> options = new HashMap<String, Object>();
	options.put("closeOnQuit", true);

	caps.setCapability("appdriver-options", options);   
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("browserName", "Chrome");
    caps.setCapability("version", "latest-12");
    caps.setCapability("name", "Sauce Lab Testing");
    caps.setCapability("screenResolution", "1680x1050");
    
    
    try {
    	
  
        RemoteWebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.setFileDetector(new LocalFileDetector()); 

		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    
		//driver.setFileDetector(new LocalFileDetector()); // using file upload to remote webdriver
		
		WebElement browsers = driver.findElement(By.xpath("//a[text()='Download Text File']"));
		browsers.click();
		Thread.sleep(6000);
		//File f = new File(downloadFilepath);
		//File[] f1 = f.listFiles();
		//for(int i=0;i<f1.length;i++) {
		//	System.out.println(f1[i]);
		//}
		System.out.println(System.getProperty("user.dir"));
		driver.quit();
    } catch(Exception e) {
        System.out.println(e);
    }
    

}
}
