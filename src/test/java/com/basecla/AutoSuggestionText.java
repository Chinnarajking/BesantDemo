package com.basecla;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionText {
	
	@Test
	public void Autosuggest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("//*[@name='q']"));
		text.sendKeys("Chennai");
		
		Thread.sleep(3000);
		
		List<WebElement> auto = driver.findElements(By.xpath("//*[@class='G43f7e']//li"));
		
		int size = auto.size();
		
		System.out.println(size);
		
		auto.get(size-2).click();
	}
	
	 
	
	}


