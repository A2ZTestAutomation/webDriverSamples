package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select singSel = new Select(driver.findElement(By.id("select-demo")));

		singSel.selectByValue("Tuesday");
		
		Select mulSel = new Select(driver.findElement(By.id("multi-select")));
		if(mulSel.isMultiple()) {
			mulSel.selectByIndex(0);
			mulSel.selectByValue("Florida");
			mulSel.selectByVisibleText("Washington");
		}
		List<WebElement> items = mulSel.getAllSelectedOptions();
		System.out.println("Items Selected : "+items.size());
		mulSel.deselectByValue("Florida");
		
		
	}

}
