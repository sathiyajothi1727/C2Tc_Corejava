package com.sathiya.assignments.assignment1;
import java.util.Scanner;
public class Commision {
	String name,address,commision;

	 long phone,salesAmount;

	 



	

public void getEmployeesDetails()

{

	Scanner s=new Scanner(System.in);

	System.out.println("Enter your name: ");

	name=s.nextLine();

	System.out.println("Enter your Address: ");

	address=s.nextLine();

	System.out.println("Enter your Phone number: ");

	phone=s.nextLong();

	System.out.println("Enter your Sales amount: ");

	salesAmount=s.nextLong();

}

public void CalCommision()

{

	if(salesAmount>=100000)

	{

		commision="10%";

	}

	else if(50000<=salesAmount && salesAmount<100000)

	{

		commision="5%";

	}

	else if(30000<=salesAmount && salesAmount<50000)

	{

		commision="3%";

	}

	else

	{

		commision="0";

	}

	System.out.println("your commision: "+commision);

	

		

	

	

}

public static void main(String args[])

{

	Commision c=new Commision();

	c.getEmployeesDetails();

	c.CalCommision();

}



	 

	



}
