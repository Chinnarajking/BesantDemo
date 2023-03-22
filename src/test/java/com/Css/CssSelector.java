package com.Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	@Test
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("*#email")).sendKeys("Hello");
		driver.findElement(By.cssSelector("*#pass")).sendKeys("123456");
		driver.findElement(By.cssSelector("*[name='login']")).click();
		
		driver.quit();
	}
	
}
