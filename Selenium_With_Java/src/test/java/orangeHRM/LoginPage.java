package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	//Constructor
	LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	//Actions method
	public void sendUn(String un) {
		username.sendKeys(un);
	}
	public void sendPass(String pass) {
		Password.sendKeys(pass);
	}
	public void submitDetails() {
		submit.click();
	}
}
