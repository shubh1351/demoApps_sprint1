package pomUseToWriteScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomRepositary2.SingUpPage;

public class RegisterShopper {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/signup");
		SingUpPage singup=new SingUpPage(driver);
		singup.singUp("shubh", "maurya");
		

	}

}
