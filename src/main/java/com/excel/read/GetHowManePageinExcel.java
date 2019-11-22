package com.excel.read;

import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

public class GetHowManePageinExcel {
public static void main(String[] args) {
	try {
	FileInputStream fis = new FileInputStream("E:\\DINESH\\TestDataExcel.xlsx");
	XSSFWorkbook book = new XSSFWorkbook(fis);
	System.out.println("There are " + book.getNumberOfSheets() + " Sheets Present.");
	System.out.println(book.getWorkbookType());
	
	
	// Sheet iterate using while loop
	Iterator<Sheet> sheetIterator = book.sheetIterator();
	System.out.println("Retrive all sheets from excel(using while loop)");
	while (sheetIterator.hasNext()) {
        Sheet sheet = sheetIterator.next();
        System.out.println("=> " + sheet.getSheetName());
    }
	
	// Sheet iterator using for loop
	System.out.println("Retrive all sheets from excel(using foreach loop)");
	for(Sheet sheet : book) {
		System.out.println("--> " + sheet.getSheetName());
	}
	
	// Java 8 forEach loop Example
	System.out.println("Retrieving Sheets using Java 8 forEach with lambda");
    book.forEach(sheet -> {
    System.out.println("<--> " + sheet.getSheetName());
    });
	
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
