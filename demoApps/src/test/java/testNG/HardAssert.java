package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void test1() {
		String actualresult="Qspider";
		String expectedresult="Qspider";
		Assert.assertEquals(actualresult, expectedresult);
		System.out.println("pass:The results are matching");
		
	}
	@Test
	public void test2() {
		String actualresult="Qspider";
		String expectedresult="Jspider";
		Assert.assertEquals(actualresult, expectedresult);
		System.out.println("pass: the reults are matching");
		
	}
	@Test
	public void test3() {
		int actualresult=76;
		int expectedresult=76;
		Assert.assertEquals(actualresult, expectedresult);
		System.out.println("pass: the reults are matching");
		
	}
	@Test
	public void test4() {
		int actualresult=76;
		int expectedresult=86;
		Assert.assertEquals(actualresult, expectedresult);
		System.out.println("pass: the reults are matching");
		
	}

}
