package AdactinAll;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Data.BaseDataDriven;

public class SearchHotelN extends BaseDataDriven {
	public SearchHotelN() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = ("//*[@colspan='2'][3]"))
	private WebElement SearchHotel;
	@FindBy(id = "location")
	private WebElement loc;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(xpath = ("//*[@name='room_nos']"))
	private WebElement roomnos;
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	@FindBy(id = "child_room")
	private WebElement childroom;
	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getSearchHotel() {
		return SearchHotel;
	}
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSubmit() {
		return submit;
	}
		}
	
   	
	
	


