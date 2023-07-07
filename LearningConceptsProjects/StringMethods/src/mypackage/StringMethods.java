package mypackage;

public class StringMethods {

	public static void main(String[] args) 
	{
	//Initializing string with some string value
		String string_var1 = "My name is ANMOL PARASHAR.";
		String string_var2 = "ANMOL PARASHAR";
		String string_var3 = "ANMOL PARASHAR";
		String string_var4 = "anmol parashar";
		String string_var5 = "AnmolParashar";
		String string_var6 = "   ";
		String string_var7 = "";
		String string_var8 = "   Hi, Love!       ";
		
		//Commonly used String functions/methods
		System.out.println("String Operations are:");
		
		//Getting character at specific position
		System.out.println(string_var1.charAt(3));
		
		//Getting unicode character at specific index
		System.out.println(string_var1.codePointAt(3));
		
		//Getting unicode character before the specific index
		System.out.println(string_var1.codePointBefore(4));
		
		//Counting number of unicode characters between the indexes given
		System.out.println(string_var1.codePointCount(3, 8));
		
		System.out.println("----------------------------------------------");
		
		//Compare two strings lexicographically i.e based on unicode value
		System.out.println("\nBelow are string comparision methods:");
		System.out.println(string_var1.compareTo(string_var2));
		
		//Compare two strings lexicographically ignoring the case
		System.out.println(string_var1.compareToIgnoreCase(string_var2));
		
		//Append a string with another
		System.out.println("\nConcatenated String");
		System.out.println(string_var1.concat(string_var2));
		
		//Checks whether a string contain another string 
		System.out.println(string_var1.contains(string_var2));
		
		// Checks whether a string ends with specific characters
		System.out.println(string_var1.endsWith("shar"));
		System.out.println(string_var1.endsWith("SHAR."));
		
		// Compare and returns true if the strings are equal
		System.out.println(string_var1.equals(string_var2));
		System.out.println(string_var2.equals(string_var3));
		System.out.println(string_var5.equals(string_var5));
		
		// Compare and returns true if the strings are equal by ignoring the case
		System.out.println(string_var3.equals(string_var4));
		System.out.println(string_var4.equals(string_var5));
		
		/*Hash code for a string is computed like this
		 * The hash code is computed using formula: s[0]*31(n-1) + s[1]*31(n-2) + ... + s[n-1]
		 * where, s[0] is the first element of string s, s[1] is the second element and so on.
		 * n is the length of the string
		 */
		System.out.println(string_var1.hashCode());
		
		// gets the position of first occurrence of specific character or string
		System.out.println(string_var1.indexOf("PARASHAR"));
		System.out.println(string_var1.indexOf("Parashar"));
		
		// Verifies if the string is empty or not
		System.out.println(string_var6.isEmpty());
		System.out.println(string_var7.isEmpty());
		
		// gets the position of last occurrence of specific character or string
		System.out.println(string_var1.indexOf("PARASHAR"));
		System.out.println(string_var1.indexOf("Parashar"));
		
		//Gets String Length
		System.out.println(string_var1.length());
		
		// Search string with specific value and replace it with another value
		System.out.println(string_var3.replace("ANMOL", "GIRIJA"));
		// String are immutable, we can not replace. So it create a new string in memory and shows us
		
		// Verifies if string starts with given string
		System.out.println(string_var1.startsWith("My"));
		System.out.println(string_var2.startsWith("anmol"));
		
		// Converts string to lower case
		System.out.println(string_var3.toLowerCase());
		
		// Convert Strings to Upper case
		System.out.println(string_var4.toUpperCase());
		
		//Trim space before and after the string
		System.out.println(string_var8.trim());
	}

}
