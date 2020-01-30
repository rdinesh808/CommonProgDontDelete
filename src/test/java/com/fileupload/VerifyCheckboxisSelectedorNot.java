package com.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class VerifyCheckboxisSelectedorNot {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\computer003\\Desktop\\Groovy Create\\CommonProgDontDelete\\Driver\\chromedriver.exe");
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--incognito", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	cap.setCapability (CapabilityType.ACCEPT_INSECURE_CERTS, true);
	WebDriver driver = new ChromeDriver(cap);
	driver.manage().window().maximize();
	driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,200)");
	WebElement e = driver.findElement(By.xpath("//input[@name='chkbox']"));
	boolean isChecked = e.findElement(By.tagName("input")).isSelected();
	System.out.println(isChecked);
}
}
