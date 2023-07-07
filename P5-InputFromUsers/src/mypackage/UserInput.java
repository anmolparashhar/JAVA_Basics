package mypackage;

import java.util.Scanner;

public class UserInput 
{
public static void main (String [] args)
{
	//Variable Declaration
		Scanner obj = new Scanner(System.in);
		String Name;
		short Age;
		float Salary;
		long Mobile;
		int PinCode;
		double Value;
		char Grade;
		byte Distance;
		boolean Question;
		
		System.out.println("Enter your name: ");
		Name = obj.nextLine();
		System.out.println("Enter your age: ");
		Age = obj.nextShort();
		System.out.println("Enter your Salary: ");
		Salary = obj.nextFloat();
		System.out.println("Enter the mobile Number: ");
		Mobile = obj.nextLong();
		System.out.println("Enter Area PinCode");
		PinCode = obj.nextInt();
		System.out.println("Enter any decimal place value: ");
		Value = obj.nextDouble();
		System.out.println("Grade in 10th Class: ");
		Grade = obj.next().charAt(0);
		System.out.println("Distance of nearbycity (Below 127km):");
		Distance = obj.nextByte();
		System.out.println("Is above entered values are True/False?");
		Question = obj.nextBoolean();
		System.out.println("Your name is: "+Name);
		System.out.println("Your Age is: "+Age);
		System.out.println("Your Salary is: "+Salary);
		System.out.println("Your mobile number is: "+Mobile);
		System.out.println("Your pin code is: "+PinCode);
		System.out.println("The entered vlaue is: "+Value);
		System.out.println("Your grade in 10th Class is: "+Grade);
		System.out.println("The distance of city is: "+Distance);
		System.out.println("The above entered values are: "+Question);
		if (Question == true) 
		{
			System.out.println("All the entered details are true.");
		}
		else
		{
			System.out.println("Details are false.");
		}
		obj.next();
}
}
//Test Comment