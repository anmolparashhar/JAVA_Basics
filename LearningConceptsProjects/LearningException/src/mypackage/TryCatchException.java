package mypackage;

import java.util.Scanner;

public class TryCatchException {

	public static void main(String[] args) 
	{
		//We are writing a program to divide 2 numbers
		//Variable Declaration
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("Enter first number: ");
		a = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Second number: ");
		b = Integer.parseInt(sc.nextLine());
		c = a/b;
		System.out.println("The result is: "+c);
		//Here, if instead of numbers if by mistake used put character or symbol so application
		//will crash, to prevent that we will use try and catch block
		}
		// We will give all the possible exception first later we will give general exception
		catch (NumberFormatException ex)
		{
			System.out.println("Error: Please enter numbers only.");
		}
		catch (Exception ex)
		{
			System.out.println("Some error occured, please contact admin.");
		}
		finally
		{
			sc.next();
		}
		
	}

}
