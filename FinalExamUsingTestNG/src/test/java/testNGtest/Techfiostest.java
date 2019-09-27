package testNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.Techfiospage;
import util.BrowserFactory;

public class Techfiostest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = BrowserFactory.startBrowser();

	}

	@Test
	public void ValidUserShouldAddACatagory() {
		driver.get(" http://techfios.com/test/101/");
		Techfiospage tftest = PageFactory.initElements(driver, Techfiospage.class);
		tftest.AddCatagory("TestNgTest105");
		//validating warning message
		Assert.assertTrue(tftest.isWarningMessageDisplayed(), "The category you want to add already exists");
		tftest.clickOnBackButton();
		//click on dropdown
		tftest.selectMonthDropDown();
		
		Assert.assertTrue(tftest.isMonthDropDownDisplayed(), "Months in drop down does not exist");
		

	}
     
}
