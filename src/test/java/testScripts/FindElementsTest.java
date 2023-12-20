package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/blog/");
		List<WebElement> items =  driver.findElements(
				By.xpath("//ul[@id='menu-side-menu']//li[starts-with(@id, 'menu-item-')]"));
		System.out.println("No. of items...."+items.size());
		for(WebElement item:items) {
			System.out.println(item.getText());
			System.out.println("Modified in Phase2");
			
		}
		
	}

}
