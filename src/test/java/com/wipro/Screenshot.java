package com.wipro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
@Test

public void url() throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("CurrentUrl- "+ currentUrl);
	
	String title = driver.getTitle();
	System.out.println("Title- "+ title);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File destination = new File("E:\\Facebook\\fbpage.jpeg"); 
	
	FileUtils.copyFile(source, destination);
}   

}
