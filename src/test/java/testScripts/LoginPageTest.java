package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("radius")).click();
//		driver.findElement(By.tagName("button")).click();
//		driver.findElement(By.className("fa fa-2x fa-sign-in")).click();
		
//		WebElement btn = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
		WebElement btn = driver.findElement(By.tagName("button"));
		System.out.println("Button type is :" +btn.getAttribute("type"));
//		driver.findElement(By.linkText("Elemental Selenium")).click();
		driver.findElement(By.partialLinkText("Elemental")).click();
		

	}

}
