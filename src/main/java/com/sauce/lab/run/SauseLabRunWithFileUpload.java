package com.sauce.lab.run;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class SauseLabRunWithFileUpload {
public static void main(String[] args) {
	final String USERNAME = "Dindj";
    final String ACCESS_KEY = "96685d26-4c24-46d6-b9e2-8f68caa1248a";
    final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("browserName", "Chrome");
    caps.setCapability("version", "latest-12");
    caps.setCapability("name", "Sauce Lab Testing");
    caps.setCapability("screenResolution", "1680x1050");
    try {
        RemoteWebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,950)");
	    
//		String [] array = driver.getCapabilities().toString().split(",");
//		for (int i=0;i<array.length;i++) {
//		if (array[i].contains("takesScreenshot")) {
//		driver.setFileDetector(new LocalFileDetector());
//		}
//		}
	    
		driver.setFileDetector(new LocalFileDetector()); // using file upload to remote webdriver
		
		WebElement browsers = driver.findElement(By.name("uploadfile"));
		browsers.sendKeys(System.getProperty("user.dir")+"/links.txt");
		Thread.sleep(6000);
		driver.close();
		driver.quit();
		Thread.sleep(15000);
		SessionId session = ((RemoteWebDriver)driver).getSessionId();
		String s1 = driver.getSessionId().toString();
		System.out.println(session);
		System.out.println(s1);
		String command = "curl -X GET -u Dindj:96685d26-4c24-46d6-b9e2-8f68caa1248a -o ./saucevideo/ --create-dirs mkdir https://saucelabs.com/rest/v1/Dindj/jobs/"+s1+"/assets/video.mp4 --output ./saucevideo/DJVideo.mp4";
		Process process = Runtime.getRuntime().exec(command);
		process.getInputStream();
    } catch(Exception e) {
        System.out.println(e);
    }
}
}
