package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException  {
		
		ChromeOptions options = new ChromeOptions();
		//To test in headless mode
		options.addArguments("--headless");
//		options.addArguments("--no-sandbox");
		
		//To run in different browser versions
		//This will download both browser binary & driver in user folder at ~/.cache/selenium
//		options.setBrowserVersion("115");
		
		WebDriver driver = new ChromeDriver(options);
		
		
//		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Page Title : " + driver.getTitle());
//		driver.navigate().to("https://www.google.com/");
//		WebElement searchbox = driver.findElement(By.name("qa"));
		//Unable to locate with compound class
//		WebElement searchbox = driver.findElement(By.className("gLFyf gsfi"));
		//locating with single class
//		WebElement searchbox = driver.findElement(By.className("gLFyf"));
		//Locating with compoun class using Cssselector
		WebElement searchbox = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
			
//		gLFyf gsfi
//		searchbox.sendKeys("Java Tutorial");
//		searchbox.submit();
//		System.out.println("Page Title : " + driver.getTitle());
//		driver.navigate().back();
//		System.out.println("Page Title after Back button :" + driver.getTitle());
//		driver.navigate().forward();
//		System.out.println("Current URL : " + driver.getCurrentUrl());
//		System.out.println(" Page Source : " + driver.getPageSource());
		
		searchbox.sendKeys("Java Tutorial");
//		Thread.sleep(1000);
		//ul[@role='listbox']//li//descendant::div[@class='pcTkSc']
		List<WebElement> listItems = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='pcTkSc']"));
		System.out.println("total items : " + listItems.size());
		for(int i = 0; i < listItems.size(); i++) {
			System.out.println(listItems.get(i).getText());
			if(listItems.get(i).getText().equalsIgnoreCase("java tutorial pdf")) {
				listItems.get(i).click();
				break;
			}
		}
	
	}

}
