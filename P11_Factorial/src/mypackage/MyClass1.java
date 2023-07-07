package mypackage;

import java.util.Scanner;

public class MyClass1 
{
public static void main (String [] args)
{
	System.out.println("This program is written to find the factorial of a number.");
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = obj.nextInt();
	int fact = 1;
	for (int i = 1; i<=n; i++) {
		fact = fact * i;
	}
	System.out.println(n+"! = "+fact);
	obj.next();
}
}
