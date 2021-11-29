package com.java.apachePOI;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIforread {
	public static void main(String args[]) throws Exception {

		// Create a file object
		// for the path of existing Excel file
		// Give the path of the file as parameter
		// from where file is to be read
		File file = new File("D:\\Gee.xlsx");

		// Create a FileInputStream object
		// for getting the information of the file
		FileInputStream fip = new FileInputStream(file);

		// Getting the workbook instance for XLSX file
		XSSFWorkbook workbook = new XSSFWorkbook(fip);

		// Ensure if file exist or not
		if (file.isFile() && file.exists()) {
			System.out.println("Gee.xlsx open");
		} else {
			System.out.println("Geeks.xlsx either not exist" + " or can't open");
		}
	}
}
