package genericUtil1;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pomRepostiory1.LoginPage;
import pomRepostiory1.RegisterPage;




public class ToRegisterAndLoginUser extends BaseClass {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	@Test(priority=1)
	public void registerUser()  {
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		RegisterPage register=new RegisterPage(driver);
		register.registerUser("ramkhelavan", "ramkhelavan@gmail.com", "ramkhelavan@123");
		
		wait.until(ExpectedConditions.elementToBeClickable(register.registersuccessfully));
		
		Assert.assertTrue(register.verifyRegisterSuccessfulMsg());
		
		System.out.println("pass:user has Registered Successfully");
	}
	@Test(priority=2)
	public void loginUser() {
		driver.get("https://demoapps.qspiders.com/ui/login");
		LoginPage login=new LoginPage(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(login.emailtextfield));
		login.loginUser("ramkhelavan@gmail.com","ramkhelavan@123" );
		wait.until(ExpectedConditions.elementToBeClickable(login.loginsuccessfully));
		Assert.assertTrue(login.verifySignInSuccessfulmsg());
		System.out.println("Pass:User has successfully logged in");
		
	}
	@Test
	public void test1() {
		System.out.println("you are the best");
	}

}
