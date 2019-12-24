package com.windowshandling;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHanddle_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../CommonProgramFileRead/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://wikipedia.com");
        WebElement link = driver.findElement(By.id("js-link-box-es"));
       Actions newwin = new Actions(driver);                
       newwin.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
       Thread.sleep(6000);

       WebElement link2 = driver.findElement(By.id("js-link-box-it"));
       Actions newwin2 = new Actions(driver);
       newwin.keyDown(Keys.SHIFT).click(link2).keyUp(Keys.SHIFT).build().perform();
       Thread.sleep(6000);

       WebElement link3 = driver.findElement(By.id("js-link-box-en"));
       Actions newwin3 = new Actions(driver);              
       newwin.keyDown(Keys.SHIFT).click(link3).keyUp(Keys.SHIFT).build().perform();
       Thread.sleep(6000);

       int count=0;

       String win = driver.getWindowHandle();

       ArrayList<String> allWindows = new ArrayList<String> (driver.getWindowHandles());


       driver.switchTo().window(allWindows.get(2));
       Thread.sleep(6000);

       WebElement about = driver.findElement(By.xpath("//*[@title='Find out about Wikipedia']"));
       about.click();
	
	}
}
