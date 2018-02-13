package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Helpers.BrowserHelper;
import pageObjects.HomePage;

public class GoToHomePage {

	@Before
	public void setUp() {
		BrowserHelper.start();
	}

	@Test
	public void goToHomepage() {
		HomePage.openWebpage();

	}

	@After
	public void closeBrowser() {
		BrowserHelper.stop();
	}

}
