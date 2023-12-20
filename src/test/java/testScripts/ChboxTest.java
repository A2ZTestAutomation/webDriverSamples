package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChboxTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
//		WebElement chkbox = driver.findElement(By.cssSelector("#isAgeSelected"));
//		chkbox.click();
//		System.out.println("After Select : " + chkbox.isSelected());
//		chkbox.click();
//		System.out.println("After UnSelect : " + chkbox.isSelected());
		
		//Selecting values from webtables
//		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
//		String strSalary = driver.findElement(By.xpath("//td[contains(text(), 'Wagner')]//following-sibling::td[5]")).getText();
//		System.out.println("Salary of Wagner : " + strSalary);

		
		//Selecting values from dropdown
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select singSel = new Select(driver.findElement(By.id("select-demo")));
//		singSel.selectByValue("Tuesday");
//		singSel.selectByVisibleText("Wednesday");
		singSel.selectByIndex(1);
		
		Select multiSel = new Select(driver.findElement(By.id("multi-select")));
		if(multiSel.isMultiple()) {
			multiSel.selectByIndex(1);
			multiSel.selectByValue("New York");
			multiSel.selectByVisibleText("Texas");
			List<WebElement> listItems = multiSel.getAllSelectedOptions();
			
		}
	}

}
