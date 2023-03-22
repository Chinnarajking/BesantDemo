package AdactinAll;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Data.BaseDataDriven;

public class BookaHotel extends BaseDataDriven {
	public BookaHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = ("//*[@colspan='2'][4]"))
	private WebElement bookahotel;
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
	private WebElement expirymonth;
	@FindBy(id = "cc_exp_year")
	private WebElement selectyear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvnumber;
	@FindBy(id = "book_now")
	private WebElement booknow;

	public WebElement getBookahotel() {
		return bookahotel;
	}
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
	public WebElement getExpirymonth() {
		return expirymonth;
	}
	public WebElement getSelectyear() {
		return selectyear;
	}
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	public WebElement getBooknow() {
		return booknow;
	}
}
