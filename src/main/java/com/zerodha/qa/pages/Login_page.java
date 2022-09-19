package com.zerodha.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.zerodha.qa.base.TestBase;

public class Login_page extends TestBase {
	//object repository
		@FindBy(xpath="//img[@alt='Kite']")private WebElement zerodha_logo;
		@FindBy(xpath="//h2[text()='Login to Kite']")private WebElement zerodha_tagline;
		@FindBy(xpath="//input[@autocapitalize='characters']")private WebElement zerodha_userid;
		@FindBy(xpath="//input[@placeholder='Password']")private WebElement zerodha_password ;
		@FindBy(xpath="//button[@class='button-orange wide']")private WebElement login_btn;
		//@FindBy(xpath="//input[@icon='lock']")private WebElement zerodha_pin;
		@FindBy(xpath="//input[@type='password']") private WebElement enterpin;
		@FindBy(xpath="//button[@type ='submit']") private WebElement enterpincontinue;
		//initialization
		public Login_page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//usage
		public void zerodha_logo() {
			Assert.assertTrue(zerodha_logo.isDisplayed(), "logo is not displayed");
			System.out.println("logo is  displayed");
			Reporter.log("logo is not displayed");
		}
		
		public void zerodha_tagline() {
			Assert.assertTrue(zerodha_logo.isDisplayed(), "tag line is not displayed");
			System.out.println("tag line is  displayed");
			Reporter.log("tag line is not displayed");
		}

		public void zerodha_userid(String un) {
			Assert.assertTrue(zerodha_userid.isDisplayed(), "userid is not Selected");
			System.out.println(" userid is  Selected");
			Reporter.log("userid is not Selected");
			zerodha_userid.sendKeys(un);
	
		}

		public void zerodha_password(String pw) {
			Assert.assertTrue(zerodha_password.isDisplayed(), "userid is not Selected");
			System.out.println(" zerodha_password is  Selected");
			Reporter.log("zerodha_password is not Selected");
			zerodha_password.sendKeys(pw);
		}
		
		public void login_click() throws InterruptedException {
			login_btn.click();
			
		}
		
		public void zerodha_pin(String pin) throws InterruptedException {
			
			//Assert.assertTrue(zerodha_pin.isDisplayed(), "userid is not Selected");
			System.out.println(" zerodha_pin is  Selected");
			Reporter.log("zerodha_pin is not Selected");
			Thread.sleep(2000);
			enterpin.sendKeys(pin);
			
		}
		
		public void pin_click() throws InterruptedException {
			enterpincontinue.click();
			
		}
		
}
