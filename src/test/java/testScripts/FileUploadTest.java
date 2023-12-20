package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		WebElement addFile = driver.findElement(By.xpath("//input[@type='file']"));
		String strPath = System.getProperty("user.dir")
				+ "//ImageScreenImg.png";
		addFile.sendKeys(strPath);
		
		driver.findElement(By.xpath("//span[text()='Start upload']")).click();
	}

}
