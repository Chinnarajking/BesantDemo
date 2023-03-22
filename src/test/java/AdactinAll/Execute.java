package AdactinAll;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Data.BaseDataDriven;

public class Execute extends BaseDataDriven {
	@Test
	private void tc1() throws IOException, InterruptedException {

		browserLaunch("https://adactinhotelapp.com/");

		LoginPage a = new LoginPage();
        getText(a.getUserlogin());
		inputText(a.getUser(), stringData(1, 0));
		inputText(a.getPass(), stringData(1, 1));
		btnClick(a.getLoginbtn());

		SearchHotelN b = new SearchHotelN();
		dropDownText(b.getLoc(), stringData(1, 2));
		Assert.assertEquals(b.getLoc().getAttribute("value"), stringData(1, 2));

		dropDownText(b.getHotel(), stringData(1, 3));
		Assert.assertEquals(b.getHotel().getAttribute("value"), stringData(1, 3));

		dropDownText(b.getRoomtype(), stringData(1, 4));
		Assert.assertEquals(b.getRoomtype().getAttribute("value"), stringData(1, 4));
		
		dropDownText(b.getRoomnos(), stringData(1, 5));
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(b.getRoomnos().getAttribute("value"), stringData(1, 5));

		dropDownText(b.getAdultroom(), stringData(1, 6));
		s.assertEquals(b.getAdultroom().getAttribute("value"), stringData(1, 6));

		dropDownText(b.getChildroom(), stringData(1, 7));
		s.assertEquals(b.getChildroom().getAttribute("value"), stringData(1, 7));

		btnClick(b.getSubmit());

		SelectHotelN c = new SelectHotelN();
		btnClick(c.getRadiobutton());
		btnClick(c.getContinu());

		BookaHotel d = new BookaHotel();
		inputText(d.getFirstname(), stringData(1, 8));
		Assert.assertEquals(d.getFirstname().getAttribute("value"), stringData(1, 8));

		inputText(d.getLastname(), stringData(1, 9));
		Assert.assertEquals(d.getLastname().getAttribute("value"), stringData(1, 9));

		inputText(d.getAddress(), numericData(1, 10));
		Assert.assertEquals(d.getAddress().getAttribute("value"), numericData(1, 10));

		inputText(d.getCcnumber(), numericData(1, 11));
		Assert.assertEquals(d.getCcnumber().getAttribute("value"), numericData(1, 11));

		dropDownText(d.getCctype(), stringData(1, 12));
		Assert.assertEquals(d.getCctype().getAttribute("value"), stringData(1, 12));

		dropDownText(d.getExpirymonth(), stringData(1, 13));
		
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(d.getExpirymonth().getAttribute("value"), stringData(1, 13));
		
		dropDownText(d.getSelectyear(), numericData(1, 14));
		s1.assertEquals(d.getSelectyear().getAttribute("value"), numericData(1, 14));

		inputText(d.getCvvnumber(), numericData(1, 15));
		s1.assertEquals(d.getCvvnumber().getAttribute("value"), numericData(1, 15));

		btnClick(d.getBooknow());
 
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("E:\\Adactin\\adactinpage.jpeg");
		FileUtils.copyFile(source, destination);

		BookingConfirm e = new BookingConfirm();
		printValue(e.getOrderId());
	
	}

}
