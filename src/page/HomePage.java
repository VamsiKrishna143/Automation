package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//private WebDriver driver;
	@FindBy(id="logoutLink")
	private WebElement logoutLNK;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout() {
		logoutLNK.click();
	}	
	
}
