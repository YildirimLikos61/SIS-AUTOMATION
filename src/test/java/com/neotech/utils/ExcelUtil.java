package com.neotech.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
          
	
	private static Workbook book;
	private static Sheet sheet;
	
	private static void openExcel(String path) 
	{
		try 
		{
		  FileInputStream fis =new FileInputStream(path);
		  book =new XSSFWorkbook(fis); 
		}catch(IOException a) 
		{
			a.printStackTrace();
		}
	}
	
	
	private static void loadSheet(String sheetname) 
	{
		sheet=book.getSheet(sheetname);
	}
	
	
	
	private static int getRowCount() 
	{
		return sheet.getPhysicalNumberOfRows();
	}
	
	
	
	private static int getcolumncount(int index) 
	{
		return sheet.getRow(index).getLastCellNum();
	}
	
	private static String getCellData(int indexr,int indexc) 
	{
		return sheet.getRow(indexr).getCell(indexc).toString();
	}
	
	
	public static Object[][] excelIntiArray(String path,String sheetname)
	{
		openExcel(path);
		loadSheet(sheetname);
		
		int Row=getRowCount();
		int Column=getcolumncount(0);
		
		Object[][] data =new Object[Row-1][Column];
		
		for(int row=1; row<Row; row++) 
		{
			for(int col=0; col<Column; col++) 
			{
				data[row-1][col]=getCellData(row,col);
			}
		}
		
		return data;
	}
	
	
	public static List<Map<String,String>> excelintomap(String path,String sheetname)
	{
		openExcel(path);
		loadSheet(sheetname);
		
		List<Map<String,String>> listmap=new ArrayList<>();
		
		Map<String,String> map;
		
		for(int row=1; row<getRowCount(); row++) 
		{
			map=new LinkedHashMap<>();
			
			for(int col=0; col<getcolumncount(row); col++) 
			{
				String key=getCellData(0,col);
				String value=getCellData(row,col);
				map.put(key, value);
			}
			
			listmap.add(map);
		}
		return listmap;
	}
	
	
	
	
	
	
	
	
}
