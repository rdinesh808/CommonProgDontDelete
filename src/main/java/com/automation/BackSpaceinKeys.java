package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BackSpaceinKeys {
public static void main(String[] args) throws Exception {
	ChromeDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\computer003\\Desktop\\Groovy Create\\CommonProgDontDelete\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://escrow.gsihealth.net");
	driver.manage().window().maximize();
	System.out.println(driver.manage().window().getSize());
	Thread.sleep(3000);
	WebElement user = driver.findElement(By.name("UserID"));
	user.sendKeys("gsi.power@gsihealth.com");
	Thread.sleep(3000);
	Actions navigator = new Actions(driver);
	//navigator.click(user).sendKeys(Keys.END).keyDown(Keys.SHIFT).sendKeys(Keys.HOME).sendKeys(Keys.BACK_SPACE).build().perform();
	navigator.click(user).keyDown(Keys.SHIFT).sendKeys(Keys.HOME).sendKeys(Keys.BACK_SPACE).build().perform();
}
}
