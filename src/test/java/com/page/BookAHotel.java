package com.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookAHotel extends BaseClass {
	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement ccnumber;
	
	@FindBy(id = "cc_type")
	private WebElement cctype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement month;
	
	@FindBy(id = "cc_exp_year")
	private WebElement year;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvvnumber;
	
	@FindBy(id = "book_now")
	private WebElement booknowclick;

	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnumber() {
		return ccnumber;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	public WebElement getBooknowclick() {
		return booknowclick;
	}
}
