package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHelper {
	public static WebDriver driver;

	public static void start() {
		System.out.println("Starting Chrome Browser");

		System.setProperty("webdriver.chrome.driver", "C:/selenium_drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void stop() {
		System.out.println("Closing Chrome...");
		driver.quit();
	}
}
