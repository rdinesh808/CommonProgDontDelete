package com.download;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class DownloadsFile {
	WebDriver driver;
	@BeforeSuite
	public void initial() {
		System.setProperty("webdriver.chrome.driver", "../CommonProgramFileRead/Driver/chromedriver.exe");
		String downloadFilepath = System.getProperty("user.dir")+"\\DownloadFile\\";
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	    chromePrefs.put("profile.default_content_settings.popups", 0);
	    chromePrefs.put("download.default_directory", downloadFilepath);
	    options.setExperimentalOption("prefs", chromePrefs);
	    options.addArguments("--test-type");
	    options.addArguments("start-maximized", "disable-popup-blocking");
		driver = new ChromeDriver(options);
	}
	@BeforeTest
	public void loadurl() throws Exception {
		driver.get("https://crisp.gsihealth.com/dashboard/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@BeforeClass
	public void login() throws Exception {
		driver.findElement(By.name("UserID")).sendKeys("prabhaharan.velu@gsihealth.com");	
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("Medd123#");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button/span")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[text()='Got it']")).click();
		Thread.sleep(3000);
	}
	@Test
	public void tc1() throws Exception {
		driver.findElement(By.xpath("//md-icon[@md-svg-icon='chevron-down']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Download')]")).click();
		Thread.sleep(10000);
	}
	@AfterClass
	public void logout() throws Exception {
		driver.findElement(By.xpath("//md-icon[@aria-label='logout']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		Thread.sleep(3000);
	}
	@AfterTest
	public void finish() throws Exception {
		driver.close();
	}
	@AfterSuite
	public void complete() {
		driver.quit();
		System.out.println("Success....");
	}
}
