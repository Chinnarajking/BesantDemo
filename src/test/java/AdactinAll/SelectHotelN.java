package AdactinAll;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Data.BaseDataDriven;

public class SelectHotelN extends BaseDataDriven {
	public SelectHotelN() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//*[@class='login_title']"))
	private WebElement selecthotel;

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;

	@FindBy(id = "continue")
	private WebElement continu;

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinu() {
		return continu;
	}

}
