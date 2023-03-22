package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;

public static void browserLaunch(String url) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
	
	driver.manage().window().maximize();
		
	}

public static void inputText(WebElement element, String text) {
	element.sendKeys(text);
}
	
	public static void dropDownText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
		
	}
	
public static void btnClick(WebElement element) {
	element.click();
}

}
