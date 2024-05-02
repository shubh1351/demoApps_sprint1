package pomRepostiory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="email")
	public WebElement emailtextfield;
	@FindBy (id="password")
	public WebElement passwordtextfield;
	@FindBy (xpath="//button[text()='Login']")
	public WebElement loginbutton;
	@FindBy(xpath="//div[text()='Signin successful']")
	public WebElement loginsuccessfully;
	public void loginUser(String email,String password) {
		emailtextfield.sendKeys(email);
		passwordtextfield.sendKeys(password);
		loginbutton.click();
	}
	public boolean verifySignInSuccessfulmsg() {
		return loginsuccessfully.isDisplayed();
	}

	
	

}
