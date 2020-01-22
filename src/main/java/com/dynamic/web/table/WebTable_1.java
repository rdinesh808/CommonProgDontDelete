package com.dynamic.web.table;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WebTable_1 {
public static void main(String[] args) {
    Map<String, String> map = new HashMap<String,String>();
	System.setProperty("webdriver.chrome.driver", "../CommonProgramFileRead/Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");
	driver.manage().window().maximize();
	String s1,s2;
	List<WebElement> heading = driver.findElements(By.xpath("//table[@class='dataTable']//tr/th"));
	List<WebElement> values = driver.findElements(By.xpath("//tr/td"));
	
    for(int i=0;i<=heading.size()-1;i++){
    	for(int j=0;j<=values.size()-1;j++){
    		s1 = heading.get(i).getText();
    		s2 = values.get(j).getText();
    		map.put(s1, s2);
    	}
    	for(Map.Entry m:map.entrySet()){
        	System.out.println(m.getKey() + " " + m.getValue());
        }
    }
    
    driver.quit();
}
}
