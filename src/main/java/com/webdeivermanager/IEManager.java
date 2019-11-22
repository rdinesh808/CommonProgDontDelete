package com.webdeivermanager;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEManager {
	public static void main(String[] args) throws Exception {
		WebDriverManager.iedriver().arch32().setup();
		InternetExplorerOptions op = new InternetExplorerOptions();
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();
	}
}
