package org.utility;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	
	
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\T SARANYA\\eclipse-workspace\\FramesBase\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	public static void tomax() {
		driver.manage().window().maximize();
	}
	public static void toclose()
	{
	driver.close();
	}
	public static void toPassUrl(String url)
	{
		driver.get(url);
	}
public static void toEnterInput(WebElement element,String input )
{
	element.sendKeys(input);
}
public static void toClick(WebElement element)
{
element.click();	
}
public static void toPerformMouseHover(WebElement target)
{
	a=new Actions(driver);
	a.moveToElement(target).perform();
}
public static void mouseDragAndDrop(WebElement source,WebElement dest) {
	a.dragAndDrop(source, dest).perform();
	
}
public static void mouseDoubleClick(WebElement target)
{a.doubleClick(target).perform();
}
public static void mouseContextClick(WebElement target)
{
a.contextClick(target).perform();
}
public static void switchWindow(int index) throws InterruptedException
{Set<String> winId = driver.getWindowHandles();
List<String> list=new ArrayList<String>();
list.addAll(winId);
driver.switchTo().window(list.get(index));
Thread.sleep(4000);
}
public static String readExcel(String filePath,String SheetName,int rowNum,int cellNum) throws IOException {
	
String input;
File f1=new File(filePath);
FileInputStream f=new FileInputStream(f1);
Workbook w1=new XSSFWorkbook(f);
Sheet s1 = w1.getSheet(SheetName);
Row r=s1.getRow(rowNum);
Cell c=r.getCell(cellNum);
int cellType = c.getCellType();
if (cellType==1)
{
 input=c.getStringCellValue();
}
else if (DateUtil.isCellDateFormatted(c)) {
	Date dateCellValue = c.getDateCellValue();
SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy")	;
input=sim.format(dateCellValue);
	
}
else
{
	double dd=c.getNumericCellValue();
	long l=(long)dd;
	input=String.valueOf(l);
}






return input;
}
public static void selectDropDown(WebElement option, String value)
{
	Select s=new Select(option);
	s.selectByVisibleText(value);
	
}
public static void snapFunc(WebDriver wb1,String filePath) throws Exception{
	
	TakesScreenshot ts=(TakesScreenshot)wb1;
	File srcFile=ts.getScreenshotAs(OutputType.FILE);
	File destFile=new File(filePath);
FileUtils.copyFile(srcFile, destFile);
}

}
