package com.test.BaseClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class TestBase {


	public  static WebDriver webdriver;


	public static void initialization() throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.manage().deleteAllCookies();



	}

public WebDriver getDriver() throws Exception {
	initialization();
	return this.webdriver;

}
	public static void CloseBrowser(){
		webdriver.quit();
	}


}
