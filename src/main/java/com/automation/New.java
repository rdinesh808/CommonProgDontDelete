package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class New {
	ChromeDriver driver;
	@Test(priority = 0)
	public void initial(){
		try{
		System.setProperty("webdriver.chrome.driver", "../CommonProgramFileRead/Driver/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.get("https://escrow.gsihealth.net");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void tc1() throws Exception {
		driver.findElement(By.name("UserID")).sendKeys("gsi.power@gsihealth.com");
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).sendKeys("Test123#");
		Thread.sleep(3000);
		driver.quit();
	}

}
