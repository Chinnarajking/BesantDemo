package AdactinAll;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Data.BaseDataDriven;

public class LoginPage extends BaseDataDriven {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = ("//*[@colspan='2']"))
	private WebElement userlogin;
	
	@FindBy(id = "username")
	private WebElement user;
	
	@FindBy(id = "password")
	private WebElement pass;
	
	@FindBy(id = "login")
	private WebElement loginbtn;

	public WebElement getUserlogin() {
		return userlogin;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

		}

