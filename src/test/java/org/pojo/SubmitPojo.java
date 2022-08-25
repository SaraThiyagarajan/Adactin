package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class SubmitPojo extends BaseClass{
	public SubmitPojo()
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath="//input[@type='radio']")	
	private WebElement btnRadio;
	public WebElement getBtnRadio() {
		return btnRadio;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	@FindBy (xpath="//input[@type='submit']")
	private WebElement btnSubmit;
	

}
