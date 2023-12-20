package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HideImageTest {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
//		 this will disable image loading - Method1 
		options.addArguments("--blink-settings=imagesEnabled=false");
//		 or alternatively we can set direct preference - Method 2
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.managed_default_content_settings.images", 2);
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.opencart.com/");

		
		
		
		
		
		
		
		
		
//		prefs = {"profile.managed_default_content_settings.images", 2,
//		         "profile.default_content_setting_values.notifications", 2,
//		         "profile.managed_default_content_settings.stylesheets", 2,
//		         "profile.managed_default_content_settings.cookies", 2,
//		         "profile.managed_default_content_settings.javascript", 1,
//		         "profile.managed_default_content_settings.plugins", 1,
//		         "profile.managed_default_content_settings.popups", 2,
//		         "profile.managed_default_content_settings.geolocation", 2,
//		         "profile.managed_default_content_settings.media_stream", 2,
//		};
		
	}

}
