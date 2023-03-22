package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AdactinSelectHotel extends BaseClass {
	public AdactinSelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement click;
	
	@FindBy(id = "continue")
	private WebElement conclick;

	public WebElement getClick() {
		return click;
	}

	public WebElement getConclick() {
		return conclick;
	}
}
