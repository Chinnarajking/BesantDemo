package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDataDriven {
	public static WebDriver driver;

	public static void browserLaunch(String url) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	public static String stringData(int row, int cell) throws IOException {
		File loc = new File("D:\\Java new\\DemoMaven\\DataDri\\Selenium.xlsx");
		FileInputStream input = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Selenium");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String stringValue = c.getStringCellValue();
		return stringValue;
	}
	public static String numericData(int row, int cell) throws IOException {
		File loc = new File("D:\\Java new\\DemoMaven\\DataDri\\Selenium.xlsx");
		FileInputStream input = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Selenium");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		double d = c.getNumericCellValue();
		long l = (long) d;
		String numericValue = String.valueOf(l);
		return numericValue;
	}
	public static void inputText(WebElement element, String text) {
		element.sendKeys(text);
	}
	public static void dropDownText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void printValue(WebElement element) {
	System.out.println(element.getAttribute("value"));
	}
	public static void getText(WebElement element) {
		System.out.println(element.getText());
	}
}
