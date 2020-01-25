package com.withoutSendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WithoutSendKeys {
public static void main(String[] args) throws Exception {
	WebDriver driver;
	String s1 = "prabhaharan.velu@gsihealth.com";
	String s2 = "Medd123#";
	System.setProperty("webdriver.chrome.driver", "../CommonProgramFileRead/Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://hhcuat.gsihealth.net");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions actions = new Actions(driver);
	
	WebElement name = driver.findElement(By.name("UserID"));
	name.click();
	js.executeScript("arguments[0].value='"+s1+"';",name);
	actions.sendKeys(Keys.ESCAPE).build().perform();
	Thread.sleep(2000);
	
	WebElement pass = driver.findElement(By.name("Password"));
	pass.click();
	js.executeScript("arguments[0].value='"+s2+"';",pass);
	actions.sendKeys(Keys.ESCAPE).build().perform();
	Thread.sleep(2000);
	
	WebElement log = driver.findElement(By.xpath("//button/span"));
	js.executeScript("arguments[0].click();",log);
	
	//OR
		actions.moveToElement(log).click(log).build().perform();
	
}
}
