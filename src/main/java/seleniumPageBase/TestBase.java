package seleniumPageBase;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public abstract class TestBase {
	private static boolean isInitalized=false;
	public static Properties config=null;
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	
	protected TestBase() {
		if(!isInitalized){
			initConfig();
			initDriver();
		}
	}
	
	private static void initConfig() {
		if (config == null) {
			try {
				config = new Properties();
				String config_fileName = "News.properties";
				String config_path = System.getProperty("user.dir")  + File.separator + config_fileName;
				FileInputStream config_ip = new FileInputStream(config_path);
				config.load(config_ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void initDriver(){

		if(config.getProperty("browser").equalsIgnoreCase("Firefox") ||config.getProperty("browser").equalsIgnoreCase("FF") ){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ File.separator+"driver"+ File.separator  +"geckodriver");
			driver = new FirefoxDriver();
		}
		else if (config.getProperty("browser").equals("InternetExplorer")||config.getProperty("browser").equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ File.separator+"driver"+ File.separator  +"IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if (config.getProperty("browser").equals("GoogleChrome")||config.getProperty("browser").equalsIgnoreCase("CHROME")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ File.separator +"Driver"+ File.separator +"chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			driver = new ChromeDriver(options);
		}else if (config.getProperty("browser").equalsIgnoreCase("htmlunit")) {
			driver = new HtmlUnitDriver();
		} else if(config.getProperty("browser").equalsIgnoreCase("phantomjs")||config.getProperty("browser").equalsIgnoreCase("PHANTOMJS")) {
			//driver = new PhantomJSDriver();
		}


		String waitTime = "30";
		driver.manage().timeouts().implicitlyWait(Long.parseLong(waitTime), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, 50);
	}
	@AfterSuite
	public void tearDown() {
		quitDriver();
	}
	public static void quitDriver() {
		driver.quit();
		driver = null;
	}
}
