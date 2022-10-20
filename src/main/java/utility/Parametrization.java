package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	public static String getExcelSheet(int Row,int Cell,String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\UTTAM HAKE\\eclipse-workspace\\ZerodaKit\\src\\main\\resources\\Book3.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(Row).getCell(Cell).getStringCellValue();
		
		return value;
	}
}
