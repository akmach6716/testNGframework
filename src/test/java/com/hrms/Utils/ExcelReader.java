package com.hrms.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static Workbook wbook;
	public static Sheet sheet;
	public static void openExcel(String ExcelPath) {
		try {
			FileInputStream fis= new FileInputStream(ExcelPath);
			wbook= new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void loadSheet(String sheetName)
	{
		sheet=wbook.getSheet(sheetName);
	}
	public static int rowcount()
	{
		return sheet.getPhysicalNumberOfRows();
	}
	public static int columncount(int rowIndex)
	{
		return sheet.getRow(rowIndex).getLastCellNum();
	}
	public static String cellData(int rowIndex,int colIndex)
	{
		return sheet.getRow(rowIndex).getCell(colIndex).toString();
	}
	public static  Object[][] exceltoArray(String filePath,String SheetName)
	{
		openExcel(filePath);
		loadSheet(SheetName);
		int totalrows=rowcount();
		int totalcols=columncount(0);
		Object[][] data= new Object[totalrows-1][totalcols];
		for (int i=1;i<totalrows;i++)
		{
			for (int j=0;j<totalcols;j++)
			{
				data[i-1][j]=cellData(i,j);
			}
		}
		return data;
		
	}
}
