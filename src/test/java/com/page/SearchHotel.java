package com.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "location")
	private WebElement loc;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement nuofrooms;
	
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	
	@FindBy(id = "child_room")
	private WebElement childroom;
	
	@FindBy(id = "Submit")
	private WebElement searchClick;

	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNuofrooms() {
		return nuofrooms;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearchClick() {
		return searchClick;
	}

	}
	

