package com.testcase;

import org.testng.annotations.Test;

import seleniumPage.PageObj;
import seleniumPageBase.TestBase;

public class TestCase1 extends TestBase{
	PageObj po;
	PageObj page = new PageObj (driver);
	
	@Test (priority=1, description = "Open Google Search URL",alwaysRun = true)	
	public void open_url() throws Exception {
		driver.get(config.getProperty("url"));
		page.usern(config.getProperty("username"));
		page.pass(config.getProperty("password"));
	}
	@Test (priority=2, description = "Click on first search option",alwaysRun = true)	
	public void click_first_search_option() {
		page.login();
	}
}
