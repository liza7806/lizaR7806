package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement Skybluebutton;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
	WebElement Whitebutton;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
	WebElement SkyBlueBackGround;
	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionWhite()']")
	WebElement WhiteBackGround;

	// Methods to interact with the elements
	public void clickOnTheSkyBlueButton() {
		Skybluebutton.click();

	}

	public boolean isSkyBlueButtonEnable() {
		return Skybluebutton.isEnabled();

	}

	public void clickOnTheWhiteButton() {
		Whitebutton.click();
	}

	public boolean isWhiteButtonEnable() {
		return Whitebutton.isEnabled();

	}
	public String getSkyBlueBackGroundColor() {
		return SkyBlueBackGround.getAttribute("style");
	}
	public String getWhiteBackGroundColor() {
		return WhiteBackGround.getAttribute("style");
	}

	// public void close() {
	// driver.close();
	// driver.quit();
	// }
}