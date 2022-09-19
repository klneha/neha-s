package com.zerodha.qa.com.zerodha.qa;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.zerodha.qa.base.TestBase;
import com.zerodha.qa.pages.Login_page;
import com.zerodha.qa.utility.Utitlity;

public class loginTest extends TestBase {
	@BeforeClass
	public void browser_open()
	{
		Crossbrowser("chrome");
	}
	
	@AfterClass
	public void browser_close()
	{
		//TestBase.driver.close();
	}
	
	@Test
	public void stpes_of_execution() throws InterruptedException, IOException
	{
		Login_page lp=new Login_page(driver);
		lp.zerodha_logo();
		lp.zerodha_tagline();
		String un=Utitlity.getdatafrom_excel(0, 0);
		lp.zerodha_userid(un);
		lp.zerodha_password(Utitlity.getdatafrom_excel(0, 1));
		lp.login_click();
		lp.zerodha_pin(Utitlity.getdatafrom_excel(0, 2));
		lp.pin_click();
	}
}
