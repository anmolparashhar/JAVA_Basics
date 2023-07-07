package mypackage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		welcomeScreen();
		userSelection();

	}
	public static void welcomeScreen()
	{
		System.out.println("-----------------------------------------");
		System.out.println("Welcome to Calculator");
		System.out.println("Developer Name: Anmol Parashar");
		System.out.println("-----------------------------------------");
	}
	public static void userSelection ()
	{
		//Variable Declaration
		char operator;
		Double number1, number2, result = (double) 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nChoose the operation: +, -, *, /");
		operator = sc.next().charAt(0);
		
		// User Input
		System.out.println("\nEnter first number: ");
		number1 = sc.nextDouble();
		System.out.println("\nEnter second number: ");
		number2 = sc.nextDouble();
		
		switch (operator)
		{
		//Perform addition
		case '+': 
			result = number1 + number2;
			
			break;
			
		//Perform Subtraction
		case '-': 
			result = number1 - number2;
			break;
			
		//Perform Multiplication
		case '*': 
			result = number1 * number2;
			break;
			
		//Perform Division
		case '/': 
			result = number1 / number2;
			break;
			
		default:
			System.out.println("\nInvalid Operator selection");
			break;
		}
		System.out.println("\nThe sum of "+number1+operator+number2+" is: "+result);
		
	}

}
