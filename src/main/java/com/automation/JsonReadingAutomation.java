package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class JsonReadingAutomation {
	JSONParser jsonParser;
	FileReader reader;
	Object obj;
	JSONArray usersList;
	JSONObject users;
	JSONObject user;
	
	@Test
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
	
	@Test
	public void url() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\computer003\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String urls = (String) user.get("url");
		driver.get(urls);
		driver.manage().window().maximize();
		String username = (String) user.get("username");
		driver.findElement(By.name("UserID")).sendKeys(username);
		String password = (String) user.get("password");
		driver.findElement(By.name("Password")).sendKeys(password);
	}
}
