package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameCherTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//From mainpage to frame1
		driver.switchTo().frame("frame1");
	
		WebElement inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.sendKeys("Hello Welcome");
		
		
		//from frame1 to frame3
		driver.switchTo().frame("frame3");
	
		driver.findElement(By.id("a")).click();
		
		//from frame3 to frame1
		driver.switchTo().parentFrame();
		inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.clear();
		inpBox.sendKeys("Welcome Back");
		
				
//		//from frame1 to main page
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//label//span")).getText());

	}

}
