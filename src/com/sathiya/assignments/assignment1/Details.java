package com.sathiya.assignments.assignment1;
import java.util.Scanner;

public class Details {
	public static void main(String[] args)

	{

		Scanner a=new Scanner(System.in);

		String name;

		char initial,grade;

		long rollnumber;

		float percentage;

		

		System.out.println("Enter your name: ");

		

		name=a.nextLine();

		System.out.println("Enter your initial: ");

		initial=a.next().charAt(0);

		System.out.println("Enter your roll number: ");

		rollnumber=a.nextInt();

		System.out.println("Enter your grade: ");

		grade=a.next().charAt(0);

		System.out.println("Enter your percentage: ");

		percentage=a.nextFloat();

		

		System.out.println("Name: "+name+" "+initial);

		System.out.println("Rollnumber: "+rollnumber);

		System.out.println("Grade: "+grade);

		System.out.println("Percentage: "+percentage+"%");

		a.close();

		

	

				



	}



	 

	



}
