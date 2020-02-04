package com.windows.handle;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_1 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\computer003\\Desktop\\Groovy Create\\CommonProgDontDelete\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leafground.com/");
	String parent = driver.getWindowHandle();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a/h5[text()='Window']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[contains(text(),'Wait')]")).click();
	Thread.sleep(8000);
	ArrayList<String> al1 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(al1.get(2));
	driver.manage().window().maximize();
	driver.close();
	Thread.sleep(3000);
	driver.switchTo().window(parent);
	driver.close();
}
}
