package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class DetailsPojo extends BaseClass{
	public DetailsPojo()
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (id="first_name")	
	private WebElement fName;
	public WebElement getfName() {
		return fName;
	}
	public WebElement getlName() {
		return lName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditcardNum() {
		return creditcardNum;
		
	}
	public WebElement getCreditcardType() {
		return creditcardType;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getButton() {
		return button;
	}
	@FindBy (id="last_name")	
	private WebElement lName;
	@FindBy (id="address")	
	private WebElement address;
	@FindBy (id="cc_num")	
	private WebElement creditcardNum;
	@FindBy (xpath="//select[@name='cc_type']")
	private WebElement creditcardType;
	@FindBy (id="cc_cvv")	
	private WebElement cvv;
	@FindBy (xpath="//select[@name='cc_exp_month']")
	private WebElement creditcardExpmonth;
	public WebElement getCreditcardExpmonth() {
		return creditcardExpmonth;
	}
	public WebElement getCreditcardExpYear() {
		return creditcardExpYear;
	}
	@FindBy (xpath="//select[@name='cc_exp_year']")
	private WebElement creditcardExpYear;
	
	@FindBy (xpath="//input[@type='button']")	
	private WebElement button;
	
	
	
	

}
