package mypackage;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of rows and column (row==column): ");
		int n = obj.nextInt();
		for (int i=1; i<=n; i++)
		{
			for (int j = 1; j<=n; j++)
			{
				if(i==1 || i==n || j==1 || j==n)
				{
					System.out.print("* ");
					
				}
				else
				{
					System.out.print("- ");
				}
			}
			System.out.println(" ");
		}

	}
	}

