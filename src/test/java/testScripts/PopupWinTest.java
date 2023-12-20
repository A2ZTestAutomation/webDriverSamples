package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWinTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Window Handle : " + parentWin);
		driver.findElement(By.xpath("//button[contains(text(), 'new Tab')]")).click();
		
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of windows : "+ tabs.size());
		for(String childWin:tabs) {
			System.out.println(childWin);
			if(!childWin.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(childWin);
				driver.findElement(By.xpath("//a[contains(text(), 'Java')]")).click();
			}
		}

		driver.close();
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath("//button[contains(text(), 'new Window')]")).click();

		//To handle windows in new browser window
		Set<String> wins = driver.getWindowHandles();
		System.out.println("Number of windows : "+ wins.size());
		for(String childWin:wins) {
			System.out.println(childWin);
			if(!childWin.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(childWin);
			}
		}
//		driver.close();
		driver.quit();
	}

}
