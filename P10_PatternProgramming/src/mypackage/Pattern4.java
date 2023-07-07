package mypackage;

import java.util.Scanner;

public class Pattern4 {
public static void main (String [] args)
{
	int n;
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the value of row and column (row==column): ");
	n = obj.nextInt();
	
	for (int i = 1; i<=n; i++ ) {
		for (int j=n; j>=1; j--)
			System.out.print(j + " ");
			System.out.println(" ");
	}
}
}
