package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class DataDrivenTesting2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\Eclipse Programs\\demoApps\\src\\main\\resources\\Book11.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);	
		Sheet sheet=workbook.getSheet("sheet1");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		String name=cell.getStringCellValue();
		System.out.println(name);
		long mobileno=(long)sheet.getRow(3).getCell(5).getNumericCellValue();
		System.out.println(mobileno);
	}

}
