package testNg2;

import org.testng.annotations.Test;

public class CreatingForGroupExcecution {
	@Test(priority=1,groups="smoke")
	public void registerUser() {
		System.out.println("User has registered successfuly");
	}
	@Test(priority=1,groups="smoke")
	public void loginUser() {
		System.out.println("User has Logged in successfuly");
	}
	@Test(priority=1,groups="regression")
	public void addProduct() {
		System.out.println("User has added product successfuly");
	}
	@Test(priority=1,groups="regression")
	public void payment() {
		System.out.println("User has done payment successfuly");
	}
	@Test(priority=1,groups="smoke")
	public void logoutUser() {
		System.out.println("User has logged out successfuly");
	}




}
