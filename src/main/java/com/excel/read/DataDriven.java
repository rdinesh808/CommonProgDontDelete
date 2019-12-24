package com.excel.read;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public void tc1(String name){
		try{	
			FileInputStream fis = new FileInputStream(new File("E:\\DINESH\\TestDataExcel.xlsx"));
			XSSFWorkbook book = new XSSFWorkbook(fis);
			//int sheets = book.getNumberOfSheets();    // get howmany sheets present in the excel.
			//int activesheet = book.getActiveSheetIndex();  // get index of which sheet is opened.
			//System.out.println(sheets);
			//System.out.println(activesheet);

			XSSFSheet sheet = book.getSheetAt(0);
			ArrayList<String> al = new ArrayList<String>();
			Iterator<Row> row = sheet.rowIterator();
			while(row.hasNext()){
				Row r = row.next();
				if(r.getCell(0).getStringCellValue().equalsIgnoreCase(name)){
					Iterator<Cell> ce = r.cellIterator();
					while(ce.hasNext()){
						al.add(ce.next().getStringCellValue());
					}
					System.out.println(al);
				}
			}
			}catch(Exception ex){
				System.out.println(ex.getMessage());
			}
	}
public static void main(String[] args) {
	DataDriven dd = new DataDriven();
	dd.tc1("Profile");
}
}
