package com.page;
import com.base.BaseClass;

public class Excution extends BaseClass {
	public static void main(String[] args) {
		
		browserLaunch("https://adactinhotelapp.com/");
		
		AdactinLoginPage a = new AdactinLoginPage();
		inputText(a.getUser(), "abinesh1990");
		inputText(a.getPass(), "Abinesh123");
		btnClick(a.getLoginBtn());
		
		SearchHotel s = new SearchHotel();
		dropDownText(s.getLoc(), "Melbourne");
		dropDownText(s.getHotel(), "Hotel Sunshine");
		dropDownText(s.getRoomtype(), "Deluxe");
		dropDownText(s.getNuofrooms(), "2 - Two");
		dropDownText(s.getAdultroom(), "3 - Three");
		dropDownText(s.getChildroom(), "2 - Two");
		btnClick(s.getSearchClick());
		
		AdactinSelectHotel s1 = new AdactinSelectHotel();
		btnClick(s1.getClick());
		btnClick(s1.getConclick());
		
		BookAHotel s2 = new BookAHotel();
		inputText(s2.getFirstname(), "Hello Java");
		inputText(s2.getLastname(), "Maven");
		inputText(s2.getAddress(), "Chinna");
		inputText(s2.getCcnumber(), "1234567891234567");
		dropDownText(s2.getCctype(), "VISA");
		dropDownText(s2.getMonth(), "February");
		dropDownText(s2.getYear(), "2022");
		inputText(s2.getCvvnumber(), "123");
		btnClick(s2.getBooknowclick());
	}
}
