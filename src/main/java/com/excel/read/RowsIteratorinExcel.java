package com.excel.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowsIteratorinExcel {
public static void main(String[] args) throws Exception {
	
	FileInputStream fis = new FileInputStream("E:\\DINESH\\TestDataExcel.xlsx");
	XSSFWorkbook book = new XSSFWorkbook(fis);
	XSSFSheet sheet = book.getSheetAt(2);
	Iterator<Row> row = sheet.rowIterator();
	
}
}
