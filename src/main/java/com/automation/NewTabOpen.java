package com.automation;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
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

	    String aa = driver.findElement(By.xpath("//h3[text()='What is Selenium? Introduction to Selenium Automation Testing']")).getText();
	    Thread.sleep(3000);
	    System.out.println(aa);
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://seleniumeasy.com");
		Thread.sleep(5000);
		driver.switchTo().window(tabs.get(1)).close();
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		driver.quit();
	}
}
