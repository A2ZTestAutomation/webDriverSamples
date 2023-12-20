package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
//		driver.findElement(By.id("searchBar")).sendKeys("Test");
		String strPlaceholder  = driver.findElement(
				By.id("searchBar")).getAttribute("placeholder");
		System.out.println(strPlaceholder);
		WebElement closeIcon = driver.findElement(
				By.cssSelector("a[title = 'Clear text']"));
		System.out.println(closeIcon.isDisplayed());
		if(closeIcon.isDisplayed()) {
			closeIcon.click();
		}
		

	}

}
