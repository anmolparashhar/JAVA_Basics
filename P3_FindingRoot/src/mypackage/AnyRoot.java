package mypackage;

import java.util.Scanner;

public class AnyRoot {
public static void main (String [] args)
{
	int base;
	int power;
	Scanner obj = new Scanner (System.in);
	System.out.println("Enter the base value: ");
	base = obj.nextInt();
	System.out.println("Enter the power: ");
	power = obj.nextInt();
	System.out.println("The Result is: " + Math.pow(base, power));
	obj.next();
}
}
