package com.java.apachePOI;

//import statements
import org.apache.poi.ss.usermodel.Cell;
//import statements
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Sheet;

	// import statements
	public class POIforgfgRead {
		public static void main(String[] args) 
	    {
	        try
	        {
	            FileInputStream file = new FileInputStream(new File("D:\\Gee.xlsx"));
	 
	            //Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	            //Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            //Iterate through each rows one by one
	            Iterator<Row> rowIterator = sheet.iterator();
	            while (rowIterator.hasNext()) 
	            {
	                Row row = rowIterator.next();
	                //For each row, iterate through all the columns
	                Iterator<Cell> cellIterator = row.cellIterator();
	                 
	                while (cellIterator.hasNext()) 
	                {
	                    //Cell cell = cellIterator.next();
	                    Cell celldata=(Cell) cellIterator.next();
	                    //Check the cell type and format accordingly
	                    switch (celldata.getCellType()) 
	                    {
	                    case NUMERIC://case CellType.NUMERIC:
	                            System.out.print(celldata.getNumericCellValue());
	                            break;
	                    case STRING:
	                            System.out.print(celldata.getStringCellValue());
	                            break;
	                    }
	                }
	                System.out.println("");
	            }
	            file.close();
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }
	}