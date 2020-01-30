package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ColerValueGet {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\computer003\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://hhcuat.gsihealth.net");
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	String ElementColor = driver.findElement(By.xpath("//div[text()='Log in to your account']")).getCssValue("color");
	String[] hexValue = ElementColor.replace("rgba(", "").replace(")", "").split(",");
	int hexValue1=Integer.parseInt(hexValue[0]);
	hexValue[1] = hexValue[1].trim();
	int hexValue2=Integer.parseInt(hexValue[1]);
	hexValue[2] = hexValue[2].trim();
	int hexValue3=Integer.parseInt(hexValue[2]);
	String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
	System.out.println(actualColor);
	Thread.sleep(10000);
	driver.quit();
}
}
