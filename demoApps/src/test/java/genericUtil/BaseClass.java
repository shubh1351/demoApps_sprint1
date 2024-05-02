package genericUtil;

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
	public WebDriver driver;
	@BeforeSuite
	public void  bs() {
		System.out.println("This method is before suite");
	}
	@BeforeTest
	public void bt() {
		System.out.println("This method is before test");
	}
	@BeforeClass
	public void bc() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("This method is Before Class");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("This method is before Method");
	}
	@AfterMethod
	public void am() {
		System.out.println("This method is After Method");
	}
	@AfterClass
	public void ac() {
		System.out.println("This method is After Class");
	}
	@AfterTest
	public void at() {
		System.out.println("This method is After test");
	}
	@AfterSuite
	public void as() {
		System.out.println("This method is After Suite");
	}
	@Test
	public void test1() {
		System.out.println("This method is Test Scrpit1");
		
	}

}
