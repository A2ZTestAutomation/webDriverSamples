package testScripts;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlKeyTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		//Mouse Actions
//		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav li.dropdown:nth-child(3)"));

		//Mouse Hover
//		actions.moveToElement(menu)
//			.click(driver.findElement(By.xpath("//a[contains(text(), 'Monitors (2)')]")))
//			.perform();
	
		//Waiting for the button to be clickable
		WebElement searchBox = driver.findElement(By.cssSelector("input.form-control.input-lg"));
		searchBox.sendKeys("Phone");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement searchBtn = driver.findElement(By.cssSelector("span > .btn.btn-default.btn-lg"));
		wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
		searchBtn.click();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> waitFlu = new FluentWait<WebDriver>(driver)
		  .withTimeout(Duration.ofSeconds(30))
		  .pollingEvery(Duration.ofSeconds(5))
		  .ignoring(NoSuchElementException.class);

		WebElement btn = waitFlu.until(new Function<WebDriver, WebElement>() {
		  public WebElement apply(WebDriver driver) {
		    return driver.findElement(By.cssSelector("span > .btn.btn-default.btn-lg"));
		  }
		});
		  
		
		//Mouse Right Click
//		actions.contextClick(searchBox).perform();
		//Mouse Double Click
//		driver.get("https://stqatools.com/demo/DoubleClick.php");
//		WebElement dblBtn = driver.findElement(By.xpath("//button[contains(text(), 'Double Click Me!')]"));
////		actions.doubleClick(dblBtn).perform();
//		actions.doubleClick(dblBtn).doubleClick(dblBtn).perform();
		
		
////		searchBox.sendKeys("P");//Shift+p+hone
////		searchBox.sendKeys("hone");
//			
//		searchBox.sendKeys(Keys.chord(Keys.SHIFT+"p")); // Phone
//		searchBox.sendKeys(Keys.chord(Keys.chord("hone")));
//		searchBox.sendKeys(Keys.ENTER);
//		
//		//button.btn.btn-default.btn-lg
//		//span.input-group-btn
//		//span > .btn.btn-default.btn-lg
////		driver.findElement(By.cssSelector("span > .btn.btn-default.btn-lg")).click();
//		searchBox = driver.findElement(By.cssSelector("input.form-control.input-lg"));
////		searchBox.sendKeys(Keys.PAGE_DOWN);
////		searchBox.sendKeys(Keys.PAGE_UP);
////		searchBox.sendKeys(Keys.BACK_SPACE);
//		boolean redirectElem = driver.findElement(By.name("redirect")).isDisplayed();
//		System.out.println("Redirect element Present : "+ redirectElem);
		
//		
//		
	}

}
