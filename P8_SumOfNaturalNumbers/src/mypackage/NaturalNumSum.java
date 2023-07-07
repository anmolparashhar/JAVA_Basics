package mypackage;

import java.util.Scanner;

public class NaturalNumSum {

	public static void main(String[] args) {
		System.out.println("This program is written to find the sum of 'n' natual number.");
		//Variable Declaration
		int i, n;
		long sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		n = obj.nextInt();
		for (i=1; i<=n; i++)
		{
			sum+=i;
		}
		System.out.println("The sum of " + n + " Natural Number is: " + sum);
		obj.next();
	}

}
