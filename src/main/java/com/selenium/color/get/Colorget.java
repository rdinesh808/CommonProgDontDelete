package com.selenium.color.get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colorget {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "../CommonProgramFileRead/Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://hhcuat.gsihealth.net");
	driver.manage().window().maximize();
	String str = driver.findElement(By.xpath("//div[text()='Log in to your account']")).getCssValue("color");
    System.out.println(str);
    String[] hexValue = str.replace("rgba(", "").replace(")", "").split(",");
    
    int hexValue1 = Integer.parseInt(hexValue[0]);
    hexValue[1] = hexValue[1].trim();
    
    int hexValue2 = Integer.parseInt(hexValue[1]);
    hexValue[2] = hexValue[2].trim();
    
    int hexValue3 = Integer.parseInt(hexValue[2]);
    hexValue[3] = hexValue[3].trim();
    
    int hexValue4 = Integer.parseInt(hexValue[3]);
  
    String actualColor = String.format("#%02x%02x%02x%02x", hexValue1, hexValue2, hexValue3, hexValue4);
    System.out.println(actualColor);
	driver.quit();
}
}
