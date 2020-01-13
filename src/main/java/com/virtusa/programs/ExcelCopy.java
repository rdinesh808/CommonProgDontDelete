package com.virtusa.programs;
import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelCopy {
public static void main(String[] args) throws IOException {
	FileInputStream file = new FileInputStream("Input File Path");
	 XSSFWorkbook workbook = new XSSFWorkbook(file);
	 // Getting sheet1
	 Sheet sheet = workbook.getSheet("Sheet1");
	 // Getting row at index 0 in sheet1
	 Row row = sheet.getRow(0);
	 int rowLength = row.getPhysicalNumberOfCells();
	 // Creating sheet2
	 Sheet sheetTwo = workbook.createSheet("Sheet2");
	 // Creating row at index 0 in sheet2
	 Row sheetTwoRow = sheetTwo.createRow(0);
	 // Setting value in row of sheet2 from sheet1
	 for (int i = 0; i < rowLength; i++) {
	 Cell cell = sheetTwoRow.createCell(i);
	 Cell firstSheetCell = row.getCell(i);
	 cell.setCellValue(firstSheetCell.getStringCellValue());
	 }
	 // Writing changes in Excel file
	 file.close();
	 FileOutputStream outFile = new FileOutputStream(new File("Output File Path"));
	 workbook.write(outFile);
	 outFile.close();
	 }
}
