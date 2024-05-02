package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleData {
	@DataProvider
	public Object[][] data(){
		Object[][] arr=new Object[3][3];
		arr[0][0]="abhina";
		arr[1][0]="najao";
		arr[2][0]="chhodke";
		
		arr[0][1]="aeropalne";
		arr[1][1]="helicopter";
		arr[2][1]="luna";
		
		arr[0][2]=12;
		arr[1][2]=13;
		arr[2][2]=1;
		
		return arr;
	}
	@Test(dataProvider="data")
	public void user(String name,String product,int quantity) {
		System.out.println(""+name+" wants "+product+" with "+quantity+"");
		
	}
	

}
