package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Helpers.BrowserHelper;
import pageObjects.ContactUsPage;
import pageObjects.HomePage;

public class ContactUsTest {
	@Before
	public void setUp() {
		BrowserHelper.start();
	}

	@Test
	public void openContactUsEquiry() {
		HomePage.openWebpage();
		HomePage.chooseContactUs();
		ContactUsPage.populateData();
		ContactUsPage.continueOnPage();
	}

	@After
	public void closeBrowser() {
		BrowserHelper.stop();
	}
}
