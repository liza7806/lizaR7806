package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Techfiostestpage;
import util.browserfactory;

public class validationtest {
	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToLogin() throws InterruptedException {
		driver = browserfactory.startBrowser();

		driver.get(" http://techfios.com/test/101/");
		Techfiostestpage techfiostest = PageFactory.initElements(driver, Techfiostestpage.class);
		techfiostest.checktoggleall();

		boolean outcome = techfiostest.isToggleallCheckBoxselected();
		System.out.println("ckecked" + outcome);

		if (!outcome) {
			techfiostest.checktoggleall();
			Assert.assertTrue("Checkbox is checked", outcome);

		}
		Assert.assertTrue("All check boxes are selected", techfiostest.checkalltoggleallboxesareselected());
		// uncheck everything
		techfiostest.checktoggleall();

		// validate the selection using assert
		Assert.assertTrue("Element is not selected", techfiostest.isAnElementCheckedToRemove());
		// remove single element from list
		techfiostest.removeElementFromlist();
		
		techfiostest.checktoggleall();
		
		techfiostest.removeElementFromlist();
		Assert.assertTrue("warning displayed",techfiostest.isWarningMessageDisplayed());
		
		
		
		 driver.close();
		 driver.quit();
	}
}