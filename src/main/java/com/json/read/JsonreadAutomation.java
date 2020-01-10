package com.json.read;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JsonreadAutomation {
	JSONParser jsonParser;
	FileReader reader;
	Object obj;
	JSONArray usersList;
	JSONObject users;
	JSONObject user;
	WebDriver driver;
	
	@Test(priority = 1)
	public void jsonread() {
		try {
		jsonParser = new JSONParser();
		reader = new FileReader("../CommonProgramFileRead/Data/TestData.json");
		obj = jsonParser.parse(reader);
		usersList = (JSONArray) obj;
		users = (JSONObject) usersList.get(0);
		user = (JSONObject) users.get("Datas");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 2)
	public void url() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\computer003\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		String urls = (String) user.get("url");
		driver.get(urls);
		driver.manage().window().maximize();
		String username = (String) user.get("username");
		driver.findElement(By.name("UserID")).sendKeys(username);
		String password = (String) user.get("password");
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.xpath("//button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Got it']")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 3)
	public void demog() throws Exception {
		driver.findElement(By.id("appEnrollment_menu")).click();
		Thread.sleep(3000);
		String pid = (String) user.get("patientid");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ids = driver.findElement(By.xpath("//input[@name='PatientId']"));
		js.executeScript("arguments[0].value="+pid+";", ids);
		ids.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}
}
