package pomRepostiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name")
	public WebElement nametextfield;
	@FindBy(id="email")
	public WebElement emailtextfield;
	@FindBy(id="password")
	public WebElement passwordtextfield;
	@FindBy(xpath="//button[text()='Register']")
	public WebElement registerbutton;
	@FindBy (xpath="//div[text()='Registered successfully']")
	public WebElement registersuccessfully;
	
	public void registerUser(String name,String email,String password) {
		nametextfield.sendKeys(name);
		emailtextfield.sendKeys(email);
		passwordtextfield.sendKeys(password);
		registerbutton.click();
	}
	public boolean verifyRegisterSuccessfulMsg() {
		return registersuccessfully.isDisplayed();
	}
	
}
