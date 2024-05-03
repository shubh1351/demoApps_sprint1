package testNg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleFacebookCross {
	WebDriver driver;
	@Parameters("browser")
	@Test()
	public void googleTest(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
			
		}
		if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
	}

}
