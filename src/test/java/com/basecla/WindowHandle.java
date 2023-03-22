package com.basecla;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

//Thread.sleep(3000);

		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);

		driver.findElement(By.id("newWindowBtn")).click();

		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);

		for (String allWindows : allWindowsId) {
			if (!allWindows.equals(parentWindowId)) {
				driver.switchTo().window(allWindows);
				driver.findElement(By.id("firstName")).sendKeys("Hello Java");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("name")).sendKeys("BYE BYE");

//	driver.quit();

	}

}
