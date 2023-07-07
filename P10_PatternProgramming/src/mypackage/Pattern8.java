package mypackage;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the number of rows and column (rows==column): ");
	int n = obj.nextInt();
	for (int k=1; k<=n; k++)
	{
	for (int i=1; i<=n; i++) {
		System.out.print("* ");
	}
	for (int j=1; j<=n; j++)
	{
		System.out.print("$ ");
	}
	System.out.println(" ");

	}
	}

}
