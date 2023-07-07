package mypackage;

import java.util.Scanner;

public class DataTypes 
{
	public static void main (String [] args)
	  {
		int Answer;
		Scanner obj = new Scanner (System.in);
		System.out.println("Select the number of data type for which you wants to know the details.");
		System.out.println("1. byte 2. short 3. int 4. long 5. float 6. double 7. char 8. String 9. boolean");
		Answer = obj.nextInt();
		if (Answer ==1) {
		 System.out.println(Byte.BYTES);
		 System.out.println(Byte.SIZE);
		 System.out.println(Byte.MAX_VALUE);
		 System.out.println(Byte.MIN_VALUE);
	  }
		else if (Answer==2) {
			System.out.println(Short.BYTES);
			 System.out.println(Short.SIZE);
			 System.out.println(Short.MAX_VALUE);
			 System.out.println(Short.MIN_VALUE);
		}
		else if (Answer==3) {
			System.out.println(Integer.BYTES);
			 System.out.println(Integer.SIZE);
			 System.out.println(Integer.MAX_VALUE);
			 System.out.println(Integer.MIN_VALUE);
		}
		else if (Answer==4) {
			System.out.println(Long.BYTES);
			 System.out.println(Long.SIZE);
			 System.out.println(Long.MAX_VALUE);
			 System.out.println(Long.MIN_VALUE);
		}
		else if (Answer==5) {
			System.out.println(Float.BYTES);
			System.out.println(Float.SIZE);
			System.out.println(Float.MAX_VALUE);
			System.out.println(Float.MIN_VALUE);
		}
		else if (Answer==6) {
			System.out.println(Double.BYTES);
			System.out.println(Double.SIZE);
			System.out.println(Double.MAX_VALUE);
			System.out.println(Double.MIN_VALUE);
		}
		else if (Answer==7) {
			System.out.println(Character.BYTES);
			System.out.println(Character.SIZE);
			System.out.println(Character.MAX_VALUE);
			System.out.println(Character.MIN_VALUE);
			System.out.println("In Java, the data type used to store characters is char. The char data type is a single 16-bit Unicode character. It has a minimum value of '\\u0000' (or 0) and a maximum value of '\\uffff' (or 65,535 inclusive). "
					+ "There are no negative chars.");
		}
		else if (Answer==8) {
			System.out.println("String is a reference type data type. Threfore, size varies and depends on input. "
					+ "The length is equal to the number of 16-bit Unicode characters in the string.");
		}
		else if (Answer==9) {
			System.out.println("The boolen size is 1-bit.The boolean data type has only two possible values: true and false.");
		}
		else
		{
			System.out.println("Select the correct Answer.");
		}
		obj.next();
	  }		  
}
