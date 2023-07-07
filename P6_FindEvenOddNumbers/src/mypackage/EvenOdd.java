package mypackage;

import java.util.Scanner;

public class EvenOdd {
public static void main (String [] args)
{
	// Variable Declaration
	long input;
	String result;
	
	// Read Value from users
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter any Number: ");
	input = obj.nextLong();
	
	// Logic
	/*if (input%2 == 0)
	{
		System.out.println("This is Even number.");
	}
	else
	{
		System.out.println("The is odd number.");
	}
	*/
	//Ternary Operator
	result = (input%2 == 0) ? "Even Number" : "Odd Number";
	System.out.println(result);
	obj.next();
}
}
