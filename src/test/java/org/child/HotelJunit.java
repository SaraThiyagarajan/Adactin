package org.child;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.pojo.DetailsPojo;
import org.pojo.HomePojo;
import org.pojo.LoginPojo;
import org.pojo.SubmitPojo;
import org.utility.BaseClass;

public class HotelJunit extends BaseClass {
	@BeforeClass
	public static void befCls()

	{
		launchBrowser();
		toPassUrl("http://adactinhotelapp.com/HotelAppBuild2/");
		tomax();
	}

	@Test
	public void tc1() throws IOException {
		LoginPojo l = new LoginPojo();
		toEnterInput(l.getUserName(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 0));
		toEnterInput(l.getPassword(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 1));
		toClick(l.getBtnLogin());

	}

	@Test
	public void tc2() throws IOException {
		HomePojo h = new HomePojo();
		selectDropDown(h.getLocation(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 11));
		selectDropDown(h.getHotels(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 12));
		selectDropDown(h.getRoomType(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 13));
		selectDropDown(h.getRoomNos(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 14));
		toEnterInput(h.getDatePickin(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 15));
		toEnterInput(h.getDatePickOut(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 16));
		selectDropDown(h.getAdultRoom(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 17));
		selectDropDown(h.getChildRoom(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 18));
		toClick(h.getBtnSubmit());

	}

	@Test
	public void tc3() throws IOException {
		SubmitPojo s = new SubmitPojo();
		toClick(s.getBtnRadio());
		toClick(s.getBtnSubmit());

	}

	@Test
	public void tc4() throws IOException {
		DetailsPojo d = new DetailsPojo();
		toEnterInput(d.getfName(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 2));
		toEnterInput(d.getlName(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 3));
		toEnterInput(d.getAddress(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 4));
		toEnterInput(d.getCreditcardNum(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 6));
		selectDropDown(d.getCreditcardType(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 7));
		selectDropDown(d.getCreditcardExpmonth(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 8));
		selectDropDown(d.getCreditcardExpYear(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 9));
		toEnterInput(d.getCvv(), readExcel(
				"C:\\Users\\T SARANYA\\eclipse-workspace\\FrameWorkTwo\\src\\test\\resources\\Data\\Hoteldata.xlsx",
				"Sheet1", 1, 10));
		toClick(d.getButton());

	}

	@Test
	public void tc5() throws InterruptedException {
		Thread.sleep(8000);
		System.out.println("orderno for your booking is"
				+ driver.findElement(By.xpath("//input[@id='order_no']")).getAttribute("value"));

	}
}
