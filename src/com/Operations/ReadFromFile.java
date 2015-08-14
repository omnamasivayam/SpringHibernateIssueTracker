package com.Operations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
 
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.Models.Issue;

public class ReadFromFile {
	
			private HSSFWorkbook workbook;

			public ReadFromFile(){
				
			}

			public List<Issue> getListOfIssue() throws Exception {
				
					String filename = "E:\\IPTV.xls";
					List<Issue> sheetData = new ArrayList<Issue>();
					FileInputStream fis = null;
					try {
						fis = new FileInputStream(filename);
						workbook = new HSSFWorkbook(fis);
						HSSFSheet sheet = workbook.getSheetAt(1);
						Iterator<Row> rows = sheet.rowIterator();
						rows.next();
						rows.next();
						rows.next();
						while (rows.hasNext()) {
							HSSFRow row = (HSSFRow) rows.next();
							if((row.getCell(1) != null) && (row.getCell(2) != null)){
									
								
								Date startDate = new Date();
								Date endDate = new Date();
								if ((row.getCell(12) != null) && (row.getCell(12).getCellType() == Cell.CELL_TYPE_NUMERIC)) {
									if(HSSFDateUtil.isCellDateFormatted(row.getCell(12))){
										startDate = HSSFDateUtil.getJavaDate(row.getCell(12).getNumericCellValue());
									}
								}
								if ((row.getCell(15) != null) && (row.getCell(15).getCellType() == Cell.CELL_TYPE_NUMERIC)) {
									if(HSSFDateUtil.isCellDateFormatted(row.getCell(15))){
										startDate = HSSFDateUtil.getJavaDate(row.getCell(15).getNumericCellValue());
									}
								}
								System.out.println(row.getCell(1).getStringCellValue() + " " + row.getCell(2).getStringCellValue()+ " " +row.getCell(10).getStringCellValue()+ " " +row.getCell(11).getStringCellValue()+ " " +startDate+ " " +endDate);
								Issue issue = new Issue(row.getCell(1).getStringCellValue(),row.getCell(2).getStringCellValue(),row.getCell(10).getStringCellValue(),row.getCell(11).getStringCellValue(),startDate, endDate);
								sheetData.add(issue);
								}
						}
						return sheetData;
					} 
					catch (IOException e) {
							e.printStackTrace();
							return sheetData;
					} finally {
							if (fis != null) {
								fis.close();
							}
					} 
			}
}
