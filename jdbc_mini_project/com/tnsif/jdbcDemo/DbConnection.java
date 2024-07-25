package com.tnsif.jdbcDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	 public static Connection DBCon() throws SQLException
	   {
		   String url="jdbc:mysql://localhost:3306/mmmcompany";
		   String userName="root";
		   String password="root";
		   
		 Connection con=DriverManager.getConnection(url,userName,password);  
		 
		 return con;
			
	   }

}
