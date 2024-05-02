package genericUtil;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pomRepostiory.RegisterPage;
import pomRepostiory1.LoginPage;

public class ToResgisterAndLoginUser extends BaseClass{
	@Test(priority=1)
	public void registerUser() {
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		RegisterPage register=new RegisterPage(driver);
		register.registerUser("ramkhelavan", "ramkhelavan@gmail.com", "ramkhelavan@123");
		System.out.println("User is register succcessfuly");
		
	}
	@Test(priority=2)
	public void loginUser() {
		driver.get("https://demoapps.qspiders.com/ui/login");
		LoginPage login=new LoginPage(driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(login.emailtextfield));
		login.loginUser("ramkhelavan@gmail.com", "ramkhelavan@123");
		System.out.println("pass:The user logged in");
		
	}

}
