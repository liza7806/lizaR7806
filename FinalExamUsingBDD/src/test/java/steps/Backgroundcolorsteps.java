package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import util.BrowserFactory;

public class Backgroundcolorsteps {
	WebDriver driver;
	LoginPage loginpage;

	@Before

	public void Beforerun() {
		driver = BrowserFactory.startBrowser();
		loginpage = PageFactory.initElements(driver, LoginPage.class);

	}

	@Given("^Set SkyBlue Background button exists;$")
	public void set_SkyBlue_Background_button_exists() {
		loginpage.clickOnTheSkyBlueButton();

	}

	@When("^I click on the SkyBlue button;$")
	public void i_click_on_the_SkyBlue_button() {

	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {

	}

	@Given("^Set White Background button exists;$")
	public void set_White_Background_button_exists() {

	}

	@When("^I click on the White Background button;$")
	public void i_click_on_the_White_Background_button() {
		loginpage.clickOnTheWhiteButton();

	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		loginpage.getWhiteBackGroundColor();
	}

	@After
	public void afterRun() {
		// loginpage.close();
	}
}
