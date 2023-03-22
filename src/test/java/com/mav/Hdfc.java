package com.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hdfc {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();;
WebDriver driver = new ChromeDriver();
driver.get("https://netbanking.hdfcbank.com/netbanking/");

driver.manage().window().maximize();

driver.switchTo().frame(0);

WebElement customerId = driver.findElement(By.xpath("//input[@type='text']"));
customerId.sendKeys("HelloMaven");

String text = customerId.getAttribute("value");
System.out.println("Text- "+text);


	}

}
