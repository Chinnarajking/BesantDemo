package com.mav;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAutomationtesting {

	@Test
	public void alert() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		WebElement alertOk = driver.findElement(By.xpath("//a[@href='#OKTab']"));
		alertOk.click();

		WebElement click = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		click.click();

		Thread.sleep(3000);  

		Alert ok = driver.switchTo().alert();

		String text = ok.getText();
		System.out.println(text);
		ok.accept();

		WebElement alertOk1 = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		alertOk1.click();

		Thread.sleep(2000);

		WebElement click1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		click1.click();

		Thread.sleep(2000);

		Alert ok1 = driver.switchTo().alert();

		String text2 = ok1.getText();
		System.out.println(text2);
		ok1.accept();

		WebElement text1 = driver.findElement(By.id("demo"));
	    System.out.println(text1.getText());

		WebElement alertOk2 = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		alertOk2.click();

		Thread.sleep(2000);

		WebElement click2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		click2.click();

		Thread.sleep(2000);

		Alert ok2 = driver.switchTo().alert();
		
		ok2.sendKeys("Hello Java");
		ok2.accept();

		WebElement text3 = driver.findElement(By.id("demo1"));
		System.out.println(text3.getText());

	}

}
