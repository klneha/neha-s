package com.zerodha.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utitlity {
	public static void getscreenshot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);    // capture the screenshot for you keep in selenium memory
		Date d = new Date();
		System.out.println(d);
		String filename = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File dest = new File ("C:\\Users\\hp\\Desktop\\screenshots\\sc"+filename);
		FileUtils.copyFile(src, dest);
	}

public static String getdatafrom_excel(int r,int c) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\com.zerodha.qa\\src\\main\\java\\com\\zerodha\\qa\\TestData\\zerodha_login.xlsx");
		String data=WorkbookFactory.create(file).getSheet("sheet1").getRow(r).getCell(c).getStringCellValue();
		return data;
}



// ============================================ Java Script Executor ===========================================

	// creating the boarder.==> Method which accepts the parameter but will not return anything.
	
	public static void borderbyJS(WebDriver driver,WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	
	// capturing the title. ==> Method which accepts the parameter but will return title
	
	public static String titlebyJS(WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	String Title=js.executeScript("return document.title;").toString();
	return Title;
	}
	
	// click on element
	public static void clickbyJS(WebDriver driver,WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	// generate userdefined alert.
	
	public static void alertbyJS(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}
	
	// refresh the page
	public static void refreshbyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	
	// Scrolling the page.
	
	public static void scrolldownbyJS(WebDriver driver,int x, int y) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("scroll("+x+","+y+")");    // scroll down	
	}
	
	public static void scrollupbyJS(WebDriver driver,int x, int y) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("scroll("+x+","+y+")");    // scroll up
	}
	
	// scroll into view.

	public static void scrollIntoViewbyJS(WebDriver driver,WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	
	}


}
