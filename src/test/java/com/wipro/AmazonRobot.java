
package com.wipro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonRobot {

@Test

public void url() throws AWTException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("URL- "+ currentUrl);
	
	String title = driver.getTitle();
	System.out.println("Title- "+title);
	
	WebElement mobiles = driver.findElement(By.xpath("//*[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));   
	
	Actions acc  = new Actions(driver);
	acc.moveToElement(mobiles).contextClick().build().perform();
	
	Robot r = new Robot();
	
	Thread.sleep(2000);
	
	r.keyPress(KeyEvent.VK_UP);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_ENTER);
	

	}

}
