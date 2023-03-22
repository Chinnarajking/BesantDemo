 
package com.mav;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookcopypaste {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("HelloWorld");

		Actions acc = new Actions(driver);
		acc.doubleClick(email).contextClick(email).build().perform();

		Robot r = new Robot();

		for (int i = 0; i <= 2; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		acc.contextClick(pass).perform();

		Thread.sleep(3000);

		Robot r1 = new Robot();

		for (int j = 0; j <= 3; j++) {

			r1.keyPress(KeyEvent.VK_DOWN);
			r1.keyRelease(KeyEvent.VK_DOWN);
		}					
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Email Id -" + email.getAttribute("value"));
		System.out.println("Password -" + pass.getAttribute("value"));

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
