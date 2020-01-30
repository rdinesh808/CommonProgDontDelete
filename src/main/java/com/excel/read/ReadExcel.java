package com.excel.read;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Scanner;

public class ReadExcel {
	
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\computer003\\Desktop\\Groovy Create\\CommonProgDontDelete\\Data\\TestDataExcel.xlsx";
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	static Object s1;
	
	
	public static void main(String[] args) {
		FileInputStream file = null;
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter value : ");
			int n = s.nextInt();
			file = new FileInputStream(new File(TESTDATA_SHEET_PATH));
			book = new XSSFWorkbook(file);
			sheet = book.getSheetAt(0);
			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
					if(i==n) {
					data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
					System.out.print(data[i][k] + " ");
					}else {
						continue;
					}
				}
				break;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
