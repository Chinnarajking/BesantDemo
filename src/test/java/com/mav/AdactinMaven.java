package com.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinMaven {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currenturl- "+ currentUrl);
		
		String title = driver.getTitle();
		System.out.println("Title- "+ title);
		
		WebElement titleT = driver.findElement(By.xpath("//td[@class='login_title']"));
		String text6 = titleT.getText();
		System.out.println("Home- "+text6);

		driver.findElement(By.id("username")).sendKeys("abinesh1990");
		
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		String attribute2 = userName.getAttribute("value");
		System.out.println("Username- "+ attribute2);

		driver.findElement(By.id("password")).sendKeys("Abinesh123");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
		String attribute3 = passWord.getAttribute("value");
		System.out.println("password- "+ attribute3);
		
		Thread.sleep(3000);
		

		driver.findElement(By.id("login")).click();

	    Thread.sleep(6000);

		WebElement adcText = driver.findElement(By.className("login_title"));
		String text = adcText.getText();
		System.out.println("Login Text- "+ text);

		WebElement loc = driver.findElement(By.id("location"));

		Select s = new Select(loc);
		s.selectByIndex(6);

		WebElement hotels = driver.findElement(By.name("hotels"));

		Select s1 = new Select(hotels);
		s1.selectByIndex(2);

		WebElement roomType = driver.findElement(By.name("room_type"));

		Select s2 = new Select(roomType);
		s2.selectByIndex(3);

		WebElement numberOfRooms = driver.findElement(By.name("room_nos"));

		Select s3 = new Select(numberOfRooms);
		s3.selectByIndex(6);

		WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));

		Select s4 = new Select(adultsPerRoom);
		s4.selectByIndex(4);

		WebElement childrenPerRoom = driver.findElement(By.id("child_room"));

		Select s5 = new Select(childrenPerRoom);
		s5.selectByIndex(3);

		driver.findElement(By.id("Submit")).click();
		
		Thread.sleep(5000);

		WebElement text2 = driver.findElement(By.className("login_title"));
		String text1 = text2.getText();
		System.out.println(text1);

		driver.findElement(By.id("radiobutton_0")).click();

		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(5000);

		WebElement title1 = driver.findElement(By.xpath("(//td[@class='login_title'])[2]"));
		String text3 = title1.getText();
		System.out.println(text3);

		driver.findElement(By.id("first_name")).sendKeys("HelloJava");

		driver.findElement(By.id("last_name")).sendKeys("World");

		driver.findElement(By.id("address")).sendKeys("1234567890");
		
		driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		
		WebElement dummyData = driver.findElement(By.xpath("//label[@id='cc_num_tip']"));
		String text7 = dummyData.getText();
		System.out.println(text7);

		WebElement ccType = driver.findElement(By.id("cc_type"));

		Select s6 = new Select(ccType);
		s6.selectByIndex(3);

		WebElement expiryDate = driver.findElement(By.id("cc_exp_month"));

		Select s7 = new Select(expiryDate);
		s7.selectByIndex(8);

		WebElement year = driver.findElement(By.id("cc_exp_year"));

		Select s8 = new Select(year);
		s8.selectByIndex(5);

		driver.findElement(By.id("cc_cvv")).sendKeys("123");

		driver.findElement(By.id("book_now")).click();

		Thread.sleep(4000);

		WebElement text4 = driver.findElement(By.id("process_span"));
		String textT = text4.getText();
		System.out.println(textT);

		Thread.sleep(4000);
		
		WebElement bookingConf = driver.findElement(By.xpath("//td[@class='login_title']"));
		String text8 = bookingConf.getText();
		System.out.println(text8);

		WebElement text5 = driver.findElement(By.xpath("(//input[@id='order_no'])"));
		String attribute = text5.getAttribute("value");
		System.out.println(attribute);

		driver.quit();

	}

}
