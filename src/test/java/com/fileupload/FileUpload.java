package com.fileupload;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {
	public static void main(String[] args) throws IOException, Exception {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\computer003\\Desktop\\Groovy Create\\CommonProgDontDelete\\Driver\\chromedriver.exe");
		//Instantiation of driver object. To launch Firefox browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,950)");
	    driver.switchTo().defaultContent();
		driver.findElement(By.tagName("uploadfile")).click();
	    Thread.sleep(5000);
		 
		
		
		//browse.sendKeys("C:\\Users\\computer003\\Downloads\\easyinfo.txt");
	}
}
