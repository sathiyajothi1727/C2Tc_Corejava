package com.tnsif.jdbcDemo;
import java.util.Scanner;

public class EmployeeDetails {
	public static Employee getDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=s.nextLine();
		System.out.println("Enter your ID : ");
		int id=s.nextInt();
		System.out.println("Enter your Salary :");
		double salary=s.nextDouble();
		s.nextLine();
		System.out.println("Enter your Job destination : ");
		String des=s.nextLine();
		return new Employee(name,id,salary,des);
		}

}
