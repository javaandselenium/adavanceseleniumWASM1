package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./Book2.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet("Sheet1");
//go to the row
Row r = sh.getRow(0);

//go to cell
Cell c = r.getCell(0);

//pass the data inside the excelfile
c.setCellValue("Skillrary is a online app");

FileOutputStream fos=new FileOutputStream("./Book2.xlsx");

//provide write premissions
wb.write(fos);

wb.close();



	}

}
