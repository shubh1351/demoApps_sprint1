package testNG;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert23 {
	@Test
	public void test1() {
		String actualresult="Qspider";
		String expectedreult="Qspider";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(actualresult.contains(expectedreult));
		
		System.out.println("pass:the result are matching======>before Assertion");
		
		sa.assertAll();
		System.out.println("pass:the result are matching=======>after Asdsertion");
	
	}
	@Test
	public void test2() {
		String actualresult="Qspider";
		String expectedreult="abcde";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(actualresult.contains(expectedreult));
		
		System.out.println("pass:the result are matching======>before Assertion");
		
		sa.assertAll();
		System.out.println("pass:the result are matching=======>after Asdsertion");
	

		
	}

}
