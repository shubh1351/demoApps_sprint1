package genericUtil1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;
	@BeforeSuite
	public void bs() {
		System.out.println("This is Before Suite");
	}
	@BeforeTest
	public void bt() {
		System.out.println("This is Before Test");
	}
	@BeforeClass
	public void bc() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			System.out.println("This is Before class");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("This is After Method");
	}
	
	@AfterTest
	public void at() {
		System.out.println("This is After test");
	}
	@AfterClass
	public void ac() {
		System.out.println("This is After Class");
	}
	@AfterSuite
	public void as() {
		System.out.println("This is After Suite");
	}
	@Test
	public void test() {
		System.out.println("123");
	}

}
