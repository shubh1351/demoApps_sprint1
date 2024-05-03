package testNg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookTest {
	@Test()
	public void GoogleTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
}
