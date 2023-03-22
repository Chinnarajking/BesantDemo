package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url-"+currentUrl);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("Title- "+title);
	}
	public static void dropDownText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public static void quitBrowser() {
		driver.quit();
	}
}

	// public static void closeBrowser(){
	// driver.close();
	// }
	// public static void quitBrowser(){
	// driver.quit();


