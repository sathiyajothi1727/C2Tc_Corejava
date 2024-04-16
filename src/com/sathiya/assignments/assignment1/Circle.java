package com.sathiya.assignments.assignment1;

import java.util.Scanner;



public class Circle
{
    float radius;
    String colour;
    
    
public void getInput() 
{ 
	Scanner c=new Scanner(System.in);
	System.out.println("Enter Radius:");
	radius=c.nextFloat();
	System.out.println("Enter colour:");
	colour=c.next();
	c.close();
}
public double CalArea()
{
	
	return 3.14*radius*radius;
}


public static void main(String[] args)
    {
	     Circle c=new Circle();
	     c.getInput();
	     System.out.println("The area of the circle is:"+c.CalArea());
    }     
}

