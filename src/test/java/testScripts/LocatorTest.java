package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");
		
		WebElement inputElem = driver.findElement(By.tagName("input"));
		System.out.println("Input element Attribute : " + inputElem.getAttribute("name"));
		
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		System.out.println("No. of Elements : " + elements.size());
		for(WebElement elem: elements) {
			System.out.println("Value of Name attribute : " + elem.getAttribute("name"));
		}
		driver.findElement(By.cssSelector("input[name='username']")).clear();
//		boolean isBtnDisplayed = driver.findElement(By.xpath("//a[contains(text(), 'Login')]")).isDisplayed();
//		System.out.println("Is Button Displayed : "+ isBtnDisplayed);
		driver.findElement(By.xpath("//i[contains(text(), 'Login')]")).click();
		
//		driver.findElement(By.className("radius")).click();
//		driver.findElement(By.linkText("Elemental Selenium")).click();
		String hyperText = driver.findElement(By.partialLinkText("Selenium")).getText();
		System.out.println("Visible text of Anchor Tag : "+hyperText);
		
	}

}
