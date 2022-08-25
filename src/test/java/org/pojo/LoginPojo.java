package org.pojo;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.utility.BaseClass;

	public class LoginPojo extends BaseClass{
	public LoginPojo()
	{
		PageFactory.initElements(driver, this);
		
	}
	@CacheLookup
	 @FindBy(id="username")
	 private WebElement  userName;
	@CacheLookup
	@FindBy(id="password")
	 private WebElement password; 
	@CacheLookup 
	@FindBy(id="login")
	 private WebElement btnLogin; 
	 public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}


	 

	}


