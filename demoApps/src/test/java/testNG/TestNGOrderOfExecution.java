package testNG;

import org.testng.annotations.Test;

public class TestNGOrderOfExecution {
	@Test()
	public void resiger() {
		System.out.println("user is Register successfully");
		
	}
	
	@Test()
	public void login() {
		System.out.println("user is logged in");
		
	}
	@Test()
	public void addProduct() {
		System.out.println("user successfuly added The Product");
	}
	@Test()
	public void payment() {
		System.out.println("payment is done");
	}
	@Test()
	public void logout() {
		System.out.println("user is logout successfuly");
	}
	

}
