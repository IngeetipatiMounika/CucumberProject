package com.capgemini.utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xlsheet {

	public static void main(String[] args) throws Exception {
    //main methods.....
	}

	//reads data from 1st row and 0th column
	public String run() throws Exception {
		FileInputStream file = new FileInputStream("./XLsheet/ExcelSheet.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		String url = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		return url;

	}
	//reads data from 1st row and 1st column
	public String run1() throws Exception {
		FileInputStream file = new FileInputStream("./XLsheet/ExcelSheet.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		String username = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		return username;

	}
   ////reads data from 1st row and 2nd column
	public String run2() throws Exception {
		FileInputStream file = new FileInputStream("./XLsheet/ExcelSheet.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		String password = wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
		return password;

	}

}
