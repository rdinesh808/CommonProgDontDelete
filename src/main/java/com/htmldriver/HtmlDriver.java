package com.htmldriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HtmlDriver {
	@Test
	 public void htmlUnitDriver() throws Exception {
		
	 WebDriver driver = new HtmlUnitDriver();
   	
    driver.get("https://www.google.com");					

    WebElement element = driver.findElement(By.name("q"));	
    	
   element.sendKeys("Guru99");	
  
   element.submit();			
   	
   System.out.println("Page title is: " + driver.getTitle());		
   
   driver.quit();
 }
}
