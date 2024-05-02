package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert1 {
	@Test
	public void test1() {
		String actualresult="Qspider";
		String expectedreult="spider";
		Assert.assertTrue(actualresult.contains(expectedreult));
		System.out.println("pass:the result are matching");
		
	}
	@Test
	public void test2() {
		String actualresult="Qspider";
		String expectedreult="advf";
		Assert.assertTrue(actualresult.contains(expectedreult));
		System.out.println("pass:the result are matching");
		
	}
	

}
