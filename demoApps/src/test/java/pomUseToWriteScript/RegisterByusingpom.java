package pomUseToWriteScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomRepostiory.RegisterPage;

public class RegisterByusingpom {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		RegisterPage register=new RegisterPage(driver);
		register.registerUser("raviwa", "Raviwa@gmail.com", "Raviwa123@");
	

	}

}
