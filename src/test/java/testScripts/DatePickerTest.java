package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerTest {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		selectDate("2023", "March", "15");
	}
	
	public static String[] getMonthYear(String monthYearVal) {
		return monthYearVal.split(" ");
	}
	public static void selectDate(String expYear, String expMon, String expDay) {
		String monthYearVal = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println("Month Year : "+monthYearVal);
		while(!(getMonthYear(monthYearVal)[0].equalsIgnoreCase(expMon) 
				&& getMonthYear(monthYearVal)[1].equalsIgnoreCase(expYear))) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			monthYearVal = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		}
//		driver.findElement(By.xpath("//a[text()=' 20 ']")).click();
		driver.findElement(By.xpath("//a[text()='"+ expDay + "']")).click();
	}

}
