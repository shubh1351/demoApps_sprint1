package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class DataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\Eclipse Programs\\demoApps\\src\\main\\resources\\Book1.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		String name=cell.getStringCellValue();
		System.out.println(name);
		long mob=(long)sheet.getRow(2).getCell(1).getNumericCellValue();
		System.out.println(mob);
		boolean rel=sheet.getRow(2).getCell(4).getBooleanCellValue();
		System.out.println(rel);
	
	
	}

}
