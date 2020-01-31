package com.json.read;

import java.io.FileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.json.simple.JSONArray;
import org.testng.annotations.Test;

public class JSONRead_2 {
	WebDriver driver;
	String jsonfile = "C:\\Users\\computer003\\Desktop\\Groovy Create\\CommonProgDontDelete\\Data\\TestFile.json";
    
	@Test
	public void tc1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\computer003\\Desktop\\Groovy Create\\CommonProgDontDelete\\Driver\\chromedriver.exe");;
		driver = new ChromeDriver();
		driver.get("https://escrow.gsihealth.net");
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(3000);
	}
	@Test
	public void tc2() {
		
	}
}
