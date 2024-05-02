package pomRepositary2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUpPage {
	
	WebDriver driver;
	public SingUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
		
	}
	String gender="Male";
	@FindBy (id="First Name")
	public WebElement firstnametextfield;
	@FindBy (id="Last Name")
	public WebElement lastnametextfield;
	
	@FindBy(id="Phone Number")
	public WebElement phonrnumbertextfield;
	@FindBy(id="Password")
	public WebElement passwordtextfield;
	@FindBy (id="Confirm Password")
	public WebElement confirmpasswordtextfield;
	@FindBy (id="Terms and Conditions")
	public WebElement termcheckbox;
	@FindBy (id="Register")
	public WebElement registerbutton;
	public void singUp(String fname,String lname) {
		firstnametextfield.sendKeys(fname);
		lastnametextfield.sendKeys(lname);
	}
	public void clickOnGender(String gender) {
		

		driver.findElement(By.xpath("//span[text()='"+gender+"']/..//input[@type='radio']")).click();	
		
	}
	
}
