package testUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RWexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File src =new File("C:\\Users\\aditya.machiraju\\eclipse-workspace\\sanpleArti\\TestData\\TestData.xlsx");
FileInputStream fis =new FileInputStream(src);

XSSFWorkbook wb=new XSSFWorkbook(fis);

XSSFSheet sh1= wb.getSheetAt(0);

System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());

System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());


	}

}
