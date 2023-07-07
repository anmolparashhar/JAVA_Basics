package mypackage;

public class ForLoop {
public static void main (String [] args)
{
	int i;
	for (i=1; i<=5;i++)
		/*This loop will print the hello 5 times. After checking i = 1 and i<=5 , it will first
		 * print the Hello and the i will get incremented
		 */
		System.out.println("Hello");
	//If we add, one more print statement here, so it will get printed after the loop will end
	// Because, we have not used curly braces after for loop.
	System.out.println("Hello");
	//Therefore, hello will get printed only for the 6 times not 10 times.
	
	System.out.println("****************************************************************");
	// To print hello 10 times;
	int j;
	for (j=1; j<=5; j++)
	{
		System.out.println("Hello");
		System.out.println("Hello");
	}
	System.out.println("*****************************************");
	int k;
	for (k=1; k>=5;k++) {
		System.out.println("Hello, Anmol!");
		/* Here, it will not print the Hello, Anmol!, Because the condition did not get satisfied
		 * Here, k= 1 which is not greater than and equal to 5 so, the loop end here only .
		 */
	}
}
}
