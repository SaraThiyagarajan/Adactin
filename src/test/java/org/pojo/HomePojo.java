package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class HomePojo extends BaseClass {
	public HomePojo()
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNos() {
		return roomNos;
	}
	public WebElement getDatePickin() {
		return datePickin;
	}
	public WebElement getDatePickOut() {
		return datePickOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	@FindBy(xpath="//select[@name='hotels']")
			private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")		
			private WebElement roomType;
			@FindBy(xpath=	"//select[@name='room_nos']")
			private WebElement roomNos;
			@FindBy(id="datepick_in")		
			private WebElement datePickin;
			@FindBy(id="datepick_out")
			private WebElement datePickOut;
			@FindBy(xpath="//select[@name='adult_room']")
			private WebElement adultRoom;
			@FindBy(xpath="//select[@name='child_room']")
					private WebElement	childRoom;	
			@FindBy(id="Submit")		
			private WebElement btnSubmit;
			
}
