package com.tables;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_1 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\computer003\\Desktop\\Groovy Create\\CommonProgDontDelete\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leafground.com/");
	String parent = driver.getWindowHandle();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement webtable = driver.findElement(By.xpath("//h5[contains(text(),'Web')]"));
	js.executeScript("arguments[0].scrollIntoView(true)",webtable);
	Thread.sleep(2000);
	webtable.click();
	Thread.sleep(3000);
	List<WebElement> bname = driver.findElements(By.xpath("//tbody/tr/td[2]"));
	ArrayList<String> al1 = new ArrayList<String>();
	for(WebElement s1 : bname) {
		al1.add(s1.getText());
	}
	Thread.sleep(4000);
	driver.findElement(By.xpath("//th[text()='Name']")).click();
	Thread.sleep(3000);
	List<WebElement> aname = driver.findElements(By.xpath("//tbody/tr/td[2]"));
	ArrayList<String> al2 = new ArrayList<String>();
	for(WebElement s2 : aname) {
		al2.add(s2.getText());
	}
	Thread.sleep(3000);
	driver.close();
	for(int i=0;i<al1.size();i++) {
		int count = 0;
		for(int j=0;j<al2.size();j++) {
			if(al1.get(i)==al2.get(j)) {
				count = 1;
			}else{
				boolean flag = false;
			}
		}
		System.out.println(count);
	}
	
//	if(count == 1) {
//		System.out.println("Same");
//	}else {
//		System.out.println("Not Same");
//	}
}
}
