package com.tnsif.jdbcDemo;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagementDemo {

	public static void main(String[] args) throws SQLException {
		Scanner s1=new Scanner(System.in);
		System.out.println("----------MMM COMPANY EMPLOYEE MANAGEMENT----------");
		userOpt();         
		//System.out.println("Are you want to continue ?\nYes or No");
	}

	public static void userOpt() throws SQLException {
		Scanner s1=new Scanner(System.in);
		System.out.println("What do you want to do?");
		System.out.println("1.View Details\n2.Insert\n3.Update\n4.Delete");
		int userOpt=s1.nextInt();
		switch(userOpt)
		{
		case 1:
			System.out.println("Enter the Employee ID");
			int userId=s1.nextInt();
			EmployeeOperations.viewDetails(userId);
			System.out.println("Are you want to continue ?\n1)Yes or 2)No");
			int continueOpt=s1.nextInt();
			if(continueOpt==1) {
				userOpt();
			}
			else
			{
				System.out.println("----------EXITED-----------");
			}
			break;
			
		case 2:
			
			System.out.println(EmployeeOperations.insert(EmployeeDetails.getDetails()));
			System.out.println("Are you want to continue ?\n1)Yes or 2)No");
			continueOpt=s1.nextInt();
			if(continueOpt==1) {
				userOpt();
			}
			break;
			
		case 3:
			System.out.println("enter the id :");
			int emp_id=s1.nextInt();
			System.out.println("Enter what you want to update\n1.emp_name  "+"2.emp_salary "+"3.emp_des");
			int updateField=s1.nextInt();
			EmployeeOperations.update(emp_id,updateField);
			System.out.println("Are you want to continue ?\n1)Yes or 2)No");
			continueOpt=s1.nextInt();
			if(continueOpt==1) {
				userOpt();
			}
			break;
			
		case 4:
			System.out.println("enter the id to delete");
			int id=s1.nextInt();
			EmployeeOperations.delete(id);
			System.out.println("Are you want to continue ?\n1)Yes or 2)No");
			continueOpt=s1.nextInt();
			if(continueOpt==1) {
				userOpt();
			}
			break;
			
		    
		}
	}
}
