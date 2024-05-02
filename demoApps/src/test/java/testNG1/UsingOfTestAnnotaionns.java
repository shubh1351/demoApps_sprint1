package testNG1;

import org.testng.annotations.Test;

public class UsingOfTestAnnotaionns {
	@Test(priority=1,groups="smoke")
		public void registeruser() {
		System.out.println("User has registered successfuly");
		
	}
	@Test(priority=2,groups="smoke")
		public void loginUser() {
		System.out.println("user has logged in");
	}
	@Test(priority=3,groups="regression")
		public void addProduct() {
			System.out.println("add Product you want");
		}
	@Test(priority=4,groups="regression")
		public void  payment() {
		System.out.println("payment of  the product is done");
	}
	@Test(priority=5,groups="smoke")
	public void logoutUser() {
		System.out.println("User logged out");
	}

}
