package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IFrameTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/iframe");
//		driver.switchTo().frame("mce_0_ifr");
//		driver.switchTo().frame(0);
		WebElement iFrameElem = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(iFrameElem);
		WebElement inputTxt = driver.findElement(By.id("tinymce"));
		inputTxt.clear();
		inputTxt.sendKeys("Hello Welcome");
		
		//Switch back to main page
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		WebElement linkTxt = driver.findElement(By.cssSelector("span.tox-statusbar__branding"));
		linkTxt.click();
	}

}
