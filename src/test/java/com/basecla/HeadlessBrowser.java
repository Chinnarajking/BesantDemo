package com.basecla;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	@Test 
	private void headLess() {
		
		ChromeOptions c = new ChromeOptions();
		c.addArguments("headLess");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
	   System.out.println(driver.getTitle());
		
	

}
}
