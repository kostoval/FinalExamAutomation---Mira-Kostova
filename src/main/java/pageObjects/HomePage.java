package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helpers.BrowserHelper;

public class HomePage {
	private static final String URL = "http://shop.pragmatic.bg/";

	public static void openWebpage() {
		BrowserHelper.driver.get(URL);
		WebElement contactUsButton = BrowserHelper.driver.findElement(By.linkText("Contact Us"));
		assertTrue(contactUsButton.isDisplayed());
		WebElement returnsButton = BrowserHelper.driver.findElement(By.linkText("Returns"));
		assertTrue(returnsButton.isDisplayed());
		WebElement siteMapButton = BrowserHelper.driver.findElement(By.linkText("Site Map"));
		assertTrue(siteMapButton.isDisplayed());

	}

	public static void chooseContactUs() {
		HomePage.openWebpage();
		WebElement contactUsButton = BrowserHelper.driver.findElement(By.linkText("Contact Us"));
		contactUsButton.click();
		WebElement yourNameField = BrowserHelper.driver.findElement(By.id("input-name"));
		assertTrue(yourNameField.isDisplayed());
		WebElement emailAddressField = BrowserHelper.driver.findElement(By.id("input-email"));
		assertTrue(emailAddressField.isDisplayed());
		WebElement enquiry = BrowserHelper.driver.findElement(By.id("input-enquiry"));
		assertTrue(enquiry.isDisplayed());
	}

}
