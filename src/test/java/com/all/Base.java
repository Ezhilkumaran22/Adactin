package com.all;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Actions a;
	public static Alert al;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Select s;
	public static Sheet s1;
	public static Row r;
	public static Cell c;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void currenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void toGetTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public void applyWaitTimeForAllLocs() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void removeAllCookies() {
		driver.manage().deleteAllCookies();
	}
	public static void toType(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void toclick(WebElement element) {
		element.click();
	}
	public static void toQuit() {
		driver.quit();
	}
	public static void toMove(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element);
	}
	public static void toDragDrop(WebElement elementsrc,WebElement elementtarget) {
		a= new Actions(driver);
		a.dragAndDrop(elementsrc, elementtarget);
	}
	public static void toDoubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element);
	}
	public static void toContextClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick();
	}
	public static void toAccept() {
		al = driver.switchTo().alert();
	}
	public static void toDismiss() {
		al = driver.switchTo().alert();
	}
	public static void toPassKeys(WebElement element,String value) {
		al = driver.switchTo().alert();
	}
	public static void toGetTheText() {
		String text = al.getText();
		System.out.println(text);
	}
	public static void screenShot(String filename) throws IOException {
		ts = (TakesScreenshot)driver;
		File dest = new File("C:\\Users\\EZHILKUMARAN K\\eclipse-workspace\\AdactinAutomation\\Pictures\\"+filename+".png");
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, dest);
	}
	public static void downScroll(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	public static void upScroll(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",element);
	}
	public static void toSendKeys(WebElement element,String username) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value',"+username+")",element);
	}
	public static void toGetText(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("return arguments[0].getAttribute('value')",element);
	}
	public static void toClick(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()");
	}
	public static void Frameid(String id) {
		driver.switchTo().frame(id);
	}
	public static void Framename(String name) {
		driver.switchTo().frame(name);
	}
	public static void FrameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void Frameindex(int index) {
		driver.switchTo().frame(index);
	}
	public static void FrameParent() {
		driver.switchTo().parentFrame();
	}
	public static void FrameDefault() {
		driver.switchTo().defaultContent();
	}
	public static void Framesize(String name) {
		List<WebElement> frame = driver.findElements(By.tagName(name));
		int size = frame.size();
		System.out.println(size);
	}
	public static void toSelectByIndex(WebElement element,int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}
	public static void toselectByVisibleText(WebElement element,String name) {
		s = new Select(element);
		s.deselectByVisibleText(name);
	}
	public static void toSelectByValue(WebElement element,String name) {
		s = new Select(element);
		s.selectByValue(name);
	}
	public static void multipleIs(WebElement element) {
		s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	public static void toGetOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> o = s.getOptions();
		for (int i = 0; i <o.size(); i++) {
			System.out.println(i);
		}
	}
	public static void toGetAllSelectedOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> aS = s.getAllSelectedOptions();
		for (int i = 0; i <aS.size(); i++) {
			System.out.println(i);
		}
	}
	public static void toGetFirstSelectedOptions(WebElement element) {
		s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}
	public static void toDeselectByIndex(WebElement element,int index) {
		s = new Select(element);
		s.deselectByIndex(index);
	}
	public static void toDeselectByVisibleText(WebElement element,String name) {
		s = new Select(element);
		s.deselectByVisibleText(name);
	}
	public static void toDeselectByValue(WebElement element,String name) {
		s = new Select(element);
		s.deselectByValue(name);
	}
	public static void toDeselectAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}
	
	//Datadriven
	public static String excelread(String fileName,String sheetName,int rowNo,int cellNo) throws IOException {
		File f = new File("C:\\Users\\EZHILKUMARAN K\\eclipse-workspace\\MavenProject\\Excel\\"+fileName+".xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		w.getSheet(sheetName);
		s1.getRow(rowNo);
		r.getCell(cellNo);
		String value = c.getStringCellValue();
		return value;
	}
	//numeric
	public static  String toconvertString(String fileName,String sheetName,int rowNo,int cellNo) throws IOException {
		File f = new File("C:\\Users\\EZHILKUMARAN K\\eclipse-workspace\\MavenProject\\Excel\\"+fileName+".xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		w.getSheet(sheetName);
		s1.getRow(rowNo);
		r.getCell(cellNo);
		//numeric value
		double d = c.getNumericCellValue();
		long l = (long)d;
		String value = String.valueOf(l);
		return value;
	}
	//date
	public static String togetDate(String fileName,String sheetName,int rowNo,int cellNo) throws IOException {
		File f = new File("C:\\Users\\EZHILKUMARAN K\\eclipse-workspace\\MavenProject\\Excel\\"+fileName+".xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		w.getSheet(sheetName);
		s1.getRow(rowNo);
		r.getCell(cellNo);
				Date d = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
				String value = sim.format(d);
		return value;	
	}

}
