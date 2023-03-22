package AdactinAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Data.BaseDataDriven;

public class BookingConfirm extends BaseDataDriven {
	public BookingConfirm() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderId;

	public WebElement getOrderId() {
		return orderId;
	}

}
