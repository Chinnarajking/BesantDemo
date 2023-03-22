package com.basecla;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavasctiptExecutor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

        // downCasting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement user = driver.findElement(By.id("email"));

		js.executeScript("arguments[0].setAttribute('value', 'Hello World')", user);

		WebElement pass = driver.findElement(By.id("pass"));

		js.executeScript("arguments[0].setAttribute('value', '123456')", pass);

		WebElement login = driver.findElement(By.name("login"));

		js.executeScript("arguments[0].click()", login);

	}

}
