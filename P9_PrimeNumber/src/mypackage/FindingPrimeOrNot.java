package mypackage;

import java.util.Scanner;

public class FindingPrimeOrNot {
public static void main (String [] args )
{
	System.out.println("This program is written to find weather the number is prime or not prime.");
	int Input;
	int i;
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter Any Number: ");
	Input = obj.nextInt();
	//Actual Logic
	for (i = 2; i<Input; i++)
	{
		if(Input%i==0)
			break;
			
	}
	if(i==Input)
		System.out.println("This is a Prime Number.");
	else 
		System.out.println("This is not a Prime Number.");
}
}
