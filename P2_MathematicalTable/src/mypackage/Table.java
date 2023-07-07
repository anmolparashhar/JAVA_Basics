package mypackage;
import java.util.Scanner;
public class Table
{
	public static void main (String [] args)
	{
		int num, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		System.out.println("Table Upto:");
		n = sc.nextInt();
		for (int i=1; i<=n; i++)
		{
		  System.out.println(num+"X"+i+"="+num*i);
		}
			sc.next();
	}
}
