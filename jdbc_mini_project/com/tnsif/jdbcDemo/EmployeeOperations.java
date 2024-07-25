package com.tnsif.jdbcDemo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


;


public class EmployeeOperations {

	public static String insert(Employee emp) throws SQLException
	{
		Connection con=DbConnection.DBCon();
		String query="insert into employee values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, emp.getEmp_name());
		pst.setInt(2, emp.getEmp_id());
		pst.setDouble(3, emp.getEmp_salary());
		pst.setString(4, emp.getEmp_des());
		pst.executeUpdate();
	con.close();
		
		return "UPDATED SUCCESSFULLY";
	}
	
	public static void viewDetails(int userId) throws SQLException
	{  
		Connection con=DbConnection.DBCon();
		String query="select * from employee where emp_id= "+ userId;
		Statement st=con.createStatement();
		
	    ResultSet rs=st.executeQuery(query);
	    
	    rs.next();
	    System.out.println("Employee name : " + rs.getString(1));
	    System.out.println("Employee ID : " + rs.getInt(2));
	    System.out.println("Employee salary : " + rs.getDouble(3));
	    System.out.println("Employee Job destination : " + rs.getString(4));
	    
		
		con.close();
		
		
	}
	
	public static void update(int emp_id,int updateField) throws SQLException
	{
		Connection con=DbConnection.DBCon();
		Scanner sc=new Scanner(System.in);
		
		
		if(updateField==1)
		{
			
			
			System.out.println("Enter the name ");
			String query="update employee set emp_name=? where emp_id=?";
			
			String name=sc.nextLine();
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, name);
			pst.setInt(2, emp_id);
			pst.executeUpdate();
			System.out.println("Updated successfully");
			
			con.close();
			
		}
		if(updateField==2)
		{
			System.out.println("Enter the salary ");
			String query="update employee set emp_salary=? where emp_id=?";
			double salary=sc.nextDouble();
			PreparedStatement pst=con.prepareStatement(query);
			pst.setDouble(1,salary);
			pst.setInt(2, emp_id);
			pst.executeUpdate();
			System.out.println("Updated successfully");
			
			con.close();
			
		}
		if(updateField==3)
		{
			System.out.println("Enter the job destination ");
			String query="update employee set emp_des=? where emp_id=?";
			String des=sc.nextLine();
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,des);
			pst.setInt(2, emp_id);
			pst.executeUpdate();
			System.out.println("Updated successfully");
			
			con.close();	
		}
		
		
	}
	
	public static void delete(int id) throws SQLException
	{
		Connection con=DbConnection.DBCon();
		String query="delete  from employee where emp_id="+id;
		Statement st=con.createStatement();
		st.executeUpdate(query);
		System.out.println("Deleted Successfully");
		con.close();
		
	}
}
