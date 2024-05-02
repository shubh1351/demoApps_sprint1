package testNG;

import org.testng.annotations.Test;

public class TestExecutionWithGroups {
	@Test(priority=1,groups="smoke")
	public void resiger() {
		System.out.println("user is Register successfully");
		
	}
	
	@Test(priority=2,groups="smoke")
	public void login() {
		System.out.println("user is logged in");
		
	}
	@Test(priority=3,groups="regresssion")
	public void addProduct() {
		System.out.println("user successfuly added The Product");
	}
	@Test(priority=4,groups="regresssion")
	public void payment() {
		System.out.println("payment is done");
	}
	@Test(priority=5,groups="smoke")
	public void logout() {
		System.out.println("user is logout successfuly");
	}

}
