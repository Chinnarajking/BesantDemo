package com.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQaActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		WebElement movEle = driver.findElement(By.id("doubleClickBtn"));
		
		Actions acc = new Actions(driver);
		acc.moveToElement(movEle).doubleClick(movEle).build().perform();
		
		WebElement text = driver.findElement(By.id("doubleClickMessage"));
		System.out.println(text.getText());
		
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		
		Actions acc1 = new Actions(driver);
		acc1.moveToElement(rightClick).contextClick().perform();
		
		WebElement text1 = driver.findElement(By.id("rightClickMessage"));
		System.out.println(text1.getText());
		
		WebElement clikMe = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		
		Actions acc2 = new Actions(driver);
		acc2.moveToElement(clikMe).click().perform();
		
		WebElement text2 = driver.findElement(By.id("dynamicClickMessage"));
		System.out.println(text2.getText());
		
		driver.quit();
	
	}

}
