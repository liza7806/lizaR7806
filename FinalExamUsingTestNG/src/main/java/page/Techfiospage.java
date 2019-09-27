package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Techfiospage extends BasePage {
	WebDriver driver;

	public Techfiospage(WebDriver driver) {
		this.driver = driver;
	}

	
	// Test 1: Validate a user is able to add a category and once the category is
	// added it should display.
	// Test 2: Validate a user is not able to add a duplicated category. If it does
	// then the following message will display:
	// "The category you want to add already exists: <duplicated category name>."

	// Test 3: Validate the month drop down has all the months (jan, feb, mar ...)
	// in the Due Date dropdown section.
	
	// Element library

	@FindBy(how = How.NAME, using = "data")
	WebElement AddCatagory;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement ClickAdd;
	@FindBy(how = How.XPATH, using = "//body[(contains(text(),'Sorry that TODO item already exists. '))]")
	WebElement WarningMessage;
	@FindBy(how = How.NAME, using = "due_month")
	WebElement MonthDropDown;
	@FindBy(how = How.LINK_TEXT, using = "Back")
	WebElement BackButton;

	@FindBys(@FindBy(how = How.XPATH, using = "//select[@name='due_month']/descendant::option"))
	WebElement DropDownlist;

	public void AddCatagory(String catagory) {
		AddCatagory.sendKeys(catagory);
		ClickAdd.click();

	}

	public boolean isWarningMessageDisplayed() {
		return WarningMessage.isDisplayed();
	}

	public void selectMonthDropDown() {
		MonthDropDown.click();

	}

	public boolean isMonthDropDownDisplayed() {

		Select selectmonthdropdown = new Select(MonthDropDown);
		List<WebElement> allmonthOptions = selectmonthdropdown.getOptions();

		String months = "None;Jan;Feb;Mar;Apr;May;Jun;Jul;Aug;Sep;Oct;Nov;Dec";
		String[] arrmonths = months.split(";");
		int count = 0;
		for (String str : arrmonths) {
			boolean found = false;
			for (WebElement ele : allmonthOptions) {
				if (str.equals(ele.getText())) {
					found = true;
					count++;
					System.out.println(str + "Month exists");
					break;
				}
			}
			if (!found) {
				System.out.println(str + "Month does not exist");
			}

		}
		System.out.println("Count:" + count);
		if (count < 13) {
			return false;

		} else {
			return true;
		}

	}

	public void clickOnBackButton() {
		BackButton.click();
	}

}