package com.webdeivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxManager {
	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().arch32().setup();
		FirefoxOptions op = new FirefoxOptions();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();
	}
}
