package com.zerodha.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
public static WebDriver driver;
	//this file is succesfully edited
	public void Crossbrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver\\chromedriver.exe");
		
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\jar files\\mozilla\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.out.println("Wrong browser selected by user");
		}
	

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
}
