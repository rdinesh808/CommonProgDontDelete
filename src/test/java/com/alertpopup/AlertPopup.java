package com.alertpopup;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws IOException, Exception {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\computer003\\Desktop\\Groovy Create\\CommonProgDontDelete\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//input[@value='Click for Popup']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true)", ele);
	    ele.click();
	    
	    String s1 = driver.switchTo().alert().getText();
	    Thread.sleep(3000);
	    System.out.println(s1);
	    
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
	    
	    driver.quit();
	}
}
