package com.cucumber.learn;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import cucumber.api.java.en.*;

public class Cucumber_1 {
	public WebDriver driver;
	JavascriptExecutor executor = (JavascriptExecutor)driver;

	@Given("^Open a Browser with (.+)$")
    public void open_a_browser_with(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "../CommonProgramFileRead/Driver/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
    	co.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    	co.addArguments("--incognito");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.navigate().to(url);
        Thread.sleep(3000);
    }
	@When("^Enter (.+) and (.+) then click loginbutton$")
    public void enter_and_then_click_loginbutton(String username, String password) throws Throwable {
        driver.findElement(By.name("UserID")).sendKeys(username);
		//executor.executeScript("document.getElementsByName('UserID')[0].value=Prabhaharan.velu@gsihealth.com");
        Thread.sleep(3000);
        driver.findElement(By.name("Password")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Got it']")).click();
        Thread.sleep(3000);
    }
	@Then("^Navigate to CarePlan App and Enter (.+)$")
    public void navigate_to_careplan_app_and_enter(String pateintid) throws Throwable {
		WebElement link = driver.findElement(By.id("appCareplan_menu"));
        Thread.sleep(3000);
        Actions newwin = new Actions(driver);                
        newwin.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
        String win = driver.getWindowHandle();
        ArrayList<String> allWindows = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(allWindows.get(1));
        Thread.sleep(3000);
        driver.manage().window().maximize();
        
    }
    
}
