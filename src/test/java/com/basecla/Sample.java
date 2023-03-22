package com.basecla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.main.Baseclass;

public class Sample extends Baseclass {

	public static void main(String[] args) throws InterruptedException {

		browserLaunch("https://adactinhotelapp.com/");
		getCurrentUrl();
		getTitle();

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("abinesh1990");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Abinesh123");

		WebElement login = driver.findElement(By.id("login"));
		login.click();

		WebElement loc = driver.findElement(By.id("location"));
		dropDownText(loc, "London");

		WebElement hotels = driver.findElement(By.id("hotels"));
		dropDownText(hotels, "Hotel Sunshine");

		WebElement roomtype = driver.findElement(By.id("room_type"));
		dropDownText(roomtype, "Deluxe");

		WebElement nuofrooms = driver.findElement(By.id("room_nos"));
		dropDownText(nuofrooms, "2 - Two");

		WebElement apr = driver.findElement(By.id("adult_room"));
		dropDownText(apr, "3 - Three");

		WebElement childroom = driver.findElement(By.id("child_room"));
		dropDownText(childroom, "2 - Two");

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();

		WebElement click = driver.findElement(By.id("radiobutton_0"));
		click.click();

		WebElement continue1 = driver.findElement(By.id("continue"));
		continue1.click();

		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Hi Hello");

		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Maven");

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Besant Technology");

		WebElement ccnu = driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccnu.sendKeys("1234567891234567");

		WebElement cctype = driver.findElement(By.xpath("//*[@name='cc_type']"));
		dropDownText(cctype, "VISA");

		WebElement expirydate = driver.findElement(By.id("cc_exp_month"));
		dropDownText(expirydate, "February");

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		dropDownText(year, "2022");

		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("123");

		WebElement booknow = driver.findElement(By.xpath("//*[@type='button']"));
		booknow.click();

		Thread.sleep(2000);

		quitBrowser();

	}

}
