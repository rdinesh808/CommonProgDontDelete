package com.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitExamp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\computer003\\Downloads\\chromedriver_win32\\chromedriver (2).exe");

	WebDriver driver=new ChromeDriver();
	
	WebDriverWait w =new WebDriverWait(driver,5);
	
	driver.get("https://www.google.com");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	w.until(ExpectedConditions.presenceOfElementLocated(By.name("q"))).sendKeys("Hello");
	
	driver.close();
	
	driver.quit();
}
}