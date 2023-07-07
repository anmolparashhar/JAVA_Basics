package mypackage;

public class MyClass {
	public static int factorial (int n)
	{
		System.out.println("This program is written to find the factorial of a number. We used a function here.");
		int fact = 1;
		for (int i=1; i<=n; i++)
			fact = fact*i;
		return fact;
	}
public static void main (String [] args) 
{
	int n1= 7, n2 = 5, n3 = 4, n4=11, n5=15;
	System.out.println("Factoral of "+n1+" = "+ factorial(n1));
	System.out.println("Factoral of "+n2+" = "+ factorial(n2));
	System.out.println("Factoral of "+n3+" = "+ factorial(n3));
	System.out.println("Factoral of "+n4+" = "+ factorial(n4));
	System.out.println("Factoral of "+n5+" = "+ factorial(n5));
}
}
