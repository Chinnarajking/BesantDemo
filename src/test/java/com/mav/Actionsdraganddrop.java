package com.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsdraganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions acc = new Actions(driver);
		acc.dragAndDrop(drag, drop).perform();
		
		WebElement dropped = driver.findElement(By.xpath("//*[text()='Dropped!']"));
		System.out.println(dropped.getText());
		
		
		//driver.quit();
	}

}
