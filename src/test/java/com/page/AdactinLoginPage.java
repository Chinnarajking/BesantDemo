package com.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AdactinLoginPage extends BaseClass {
	
	public AdactinLoginPage() {	
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ("//*[@colspan='2']"))
	private WebElement searchHotel;
	
	@FindBy(id = "username")
	private WebElement user;
	
	@FindBy(id = "password")
	private WebElement pass;
	
	@FindBy(id = "login")
	private WebElement loginBtn;

	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	}


