package seleniumPageBase;

import org.openqa.selenium.WebDriver;

public abstract class PageBase {
	protected WebDriver driver = null;

	public PageBase(WebDriver driver) {
		this.driver = driver;
	}
	public static void wait(int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
