package mypackage;

import java.util.Scanner;

public class FindingFactor 
{
public static void main (String [] args)
{
	int i, n;
	Scanner obj = new Scanner(System.in);
	System.out.println("This program is written to find the factor of any number.");
	System.out.println("Enter the Number: ");
	n = obj.nextInt();
	System.out.println("The factor of number " + n + " are: ");
	for (i=1; i<=n; i++) {
		
		if (n%i == 0)
		{
			System.out.print(i + ",");
		}
	}
	obj.next();
}
}
