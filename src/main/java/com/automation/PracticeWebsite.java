package com.automation;

import java.io.*;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class PracticeWebsite {
	ChromeDriver driver;
	Random r = new Random();
	JavascriptExecutor js;
	
	@Test(priority = 0)
	public void initial(){
		try{
		System.setProperty("webdriver.chrome.driver", "../CommonProgramFileRead/Driver/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		driver = new ChromeDriver(co);
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 4)
	public void finish() throws Exception{
		driver.quit();
		System.out.println("Success...");
	}
	
	@Test(priority = 1)
	public void radiobutton(){
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='radioButton']"));
		int a = r.nextInt(radio.size());
		radio.get(a).click();
		System.out.println("Selected Value index is : " + a);
	}
	
	@Parameters({"test"})
	@Test(priority = 2)
	public void autocomplete(String country) throws Exception{
		driver.findElement(By.id("autocomplete")).sendKeys(country);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li/div[contains(text(),'"+country+"')]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority = 3)
	public void newwindow() throws Exception{
		boolean b1 = driver.findElements(By.id("openwindow")).size() != 0;
		if(b1==true){
			driver.findElement(By.id("openwindow")).click();
			Thread.sleep(2000);
			ArrayList<String> win = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(win.get(1));
			driver.manage().window().maximize();
			js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,300)");
			driver.close();
		}else{
			System.out.println("No Window is Present..");
		}
	}
//public static void main(String[] args) throws Exception {
//	PracticeWebsite pw = new PracticeWebsite();
//	pw.initial();
//	pw.radiobutton();
//	pw.autocomplete("British India");
//	pw.newwindow();
//	//pw.finish();
//}
}
