package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class Techfiostestpage extends Basepage {
	WebDriver driver;

	public Techfiostestpage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "allbox")
	WebElement ToggleallCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@type= 'checkbox']")
	WebElement Wholetogglelist;
	@FindBys(@FindBy(how = How.XPATH, using = "//input[@type= 'checkbox']"))
	List<WebElement> checkboxes;
	@FindBy(how = How.XPATH, using = "//input[@value= 'Remove']")
	WebElement removekey;
	@FindBy(how = How.XPATH,using ="//b[contains(text)='Warning']")
	WebElement warningmessage;

	public void checktoggleall() {
		ToggleallCheckBox.click();

	}

	public boolean isToggleallCheckBoxselected() {
		return ToggleallCheckBox.isSelected();
	}

	public boolean checkalltoggleallboxesareselected() {
		int unckeckedcount = 0;
		for (int i = 0; i < checkboxes.size(); i++) {
			if (checkboxes.get(i).isSelected() == false) {
				unckeckedcount++;

			}

		}
		if (unckeckedcount > 0) {
			return false;
		} else {
			return true;
		}

	}

	// Test 2
	public boolean isAnElementCheckedToRemove() {
		boolean CheckOutCome = false;
		for (int i = 0; i < checkboxes.size(); i++) {
			if (i == 4) {
				checkboxes.get(i).click();
				CheckOutCome = checkboxes.get(i).isSelected();
				System.out.println("is single element selected" + CheckOutCome);
				break;
			}

		}
		return CheckOutCome;
	}

	public void removeElementFromlist() {
		removekey.click();
	}
	public boolean isWarningMessageDisplayed() {
		return warningmessage.isDisplayed();
	}
}
