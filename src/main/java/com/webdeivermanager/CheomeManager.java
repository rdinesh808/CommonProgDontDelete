package com.webdeivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheomeManager {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().arch32().version("77").setup();
	ChromeOptions op = new ChromeOptions();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Thread.sleep(3000);
	driver.close();
}
}
