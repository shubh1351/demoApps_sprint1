package pomUseToWriteScript1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomRepostiory1.LoginPage;
import pomRepostiory1.RegisterPage;

public class RegisterAndLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		RegisterPage register=new RegisterPage(driver);
		LoginPage login=new LoginPage(driver);
		register.registerUser("kanya","kanya@gmail.com","Kanya@123");
		System.out.println("Pass:The user has register himself/herself");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(login.emailtextfield));
		
		login.loginUser("kanya@gmail.com","Kanya@123" );
		System.out.println("Pass:user Login Successful");
		

	}

}
