package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helpers.BrowserHelper;

public class ContactUsPage {

	public static void populateData() {
		WebElement yourNameField = BrowserHelper.driver.findElement(By.id("input-name"));
		yourNameField.sendKeys("Mira Kostova");
		WebElement emailAddressField = BrowserHelper.driver.findElement(By.id("input-email"));
		emailAddressField.sendKeys("kostova4458@gmail.com");
		WebElement enquiry = BrowserHelper.driver.findElement(By.id("input-enquiry"));
		enquiry.sendKeys("Test Enquiry");
		WebElement submitButton = BrowserHelper.driver.findElement(By.cssSelector("input.btn.btn-primary"));
		submitButton.click();

	}

	public static void continueOnPage() {
		WebElement continueButton = BrowserHelper.driver.findElement(By.linkText("Continue"));
		continueButton.click();

	}
}
