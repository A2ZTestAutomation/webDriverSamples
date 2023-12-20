package testScripts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.BadStringOperationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDropdownTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		// To locate suggested list elements in browser
		// Goto CDP -> EventListeners -> blur -> Remove all JS objects
		// Now, from the browser we would be able to locate
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(7000);
		List<WebElement> items = driver.findElements(By.xpath("//div[contains(@class,'_2VHNef')]"));
		System.out.println(items.size());
		for (WebElement item : items) {
			System.out.println(item.getText());
		}

	}

}
