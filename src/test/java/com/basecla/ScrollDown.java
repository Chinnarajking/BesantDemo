 package com.basecla;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");

driver.manage().window().maximize();

// downCasting
JavascriptExecutor js = (JavascriptExecutor)driver;

WebElement down = driver.findElement(By.className("navFooterBackToTopText"));

js.executeScript("arguments[0].scrollIntoView(true)", down);

Thread.sleep(2000);

WebElement up = driver.findElement(By.xpath("(//*[@class='a-color-base headline truncate-2line'])[2]"));

js.executeScript("arguments[0].scrollIntoView(false)", up);

	}

}

