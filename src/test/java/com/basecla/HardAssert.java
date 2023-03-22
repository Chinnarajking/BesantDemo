package com.basecla;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssert {
	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(Url, "https://www.google./");
		
		System.out.println(driver.getTitle());
		s.assertAll();
		
		//Assert.assertEquals(currentUrl, "https://www.google/");
		
		//String title = driver.getTitle();
		//System.out.println(title);
	}
	/*@Test
	public void tc2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);*/
	}


