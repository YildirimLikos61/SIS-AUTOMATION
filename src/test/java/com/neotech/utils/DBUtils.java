package com.neotech.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DBUtils {

	
	public static Connection conn;
	public static Statement st;
	public static ResultSet rs;
	
	
	public static void  getConnection() 
	{
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILE_PATH);
		String username=ConfigsReader.getProperty("dbUserName");
		String password=ConfigsReader.getProperty("dbPassword");
		String url=ConfigsReader.getProperty("dbUrl");
		
		try 
		{
			conn=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static List<Map<String,String>> listmap(String query)
	{
		List<Map<String,String>> listofmap=new ArrayList<>();
		
		try 
		{
		  st=conn.createStatement();
		  rs=st.executeQuery(query);
		
		  ResultSetMetaData rsMeta=rs.getMetaData();
		
		  int columncount=rsMeta.getColumnCount();
		
		  Map<String,String> map;
		
		while(rs.next()) 
		{
			map=new LinkedHashMap<>();
		
			for(int i=1; i<=columncount; i++) 
			{
				map.put(rsMeta.getColumnName(i),rs.getString(i) );
			}
			
			listofmap.add(map);
		}
		
		}catch(Exception a) 
		{
			a.printStackTrace();
		}
		
		return listofmap;
	}
	
	
	
	
	
	
	public static void closeConnection() 
	{
      try 
      {
		if(conn!=null) 
		{
			conn.close();
		}
		
		if(st!=null) 
		{
			st.close();
		}
		
		if(rs!=null) 
		{
			rs.close();
		}
		
      }catch(Exception a)
      {
    	a.printStackTrace();  
      }
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
