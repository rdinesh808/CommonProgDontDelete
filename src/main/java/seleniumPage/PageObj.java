package seleniumPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import seleniumPageBase.PageBase;

public class PageObj extends PageBase{

	public PageObj(WebDriver driver) {
		super(driver);
	}
	
	// Click Login
	@FindBy(xpath = "//button/span")
	WebElement loginbutton;
	
	public String usern(String user) {
		wait(3);
		driver.findElement(By.name("UserID")).sendKeys(user);
		wait(3);
		return user;
	}
	public String pass(String pass) {
		wait(3);
		driver.findElement(By.name("Password")).sendKeys(pass);
		wait(3);
		return pass;
	}
	public void login() {
		wait(3);
	    driver.findElement(By.xpath("//button/span")).click();
		wait(3);
	}
}
