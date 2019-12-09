package com.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NewTabOpen {

	@Test
	public void newtab() throws Exception {
		
		WebDriverManager.chromedriver().arch32().setup();
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://google.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("Selenium Automation");
		
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();
		
		String s1 = Keys.chord(Keys.CONTROL,Keys.ENTER);
		WebElement s2 = driver.findElement(By.xpath("//*[text()='What is Selenium? Introduction to Selenium Automation Testing']"));
	    s2.sendKeys(s1);
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
