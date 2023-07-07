package mypackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadCharByChar {

	public static void main(String[] args) throws IOException {
		/* String subject;
		int marks;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your subject: ");
		subject = obj.nextLine();
		System.out.println("Enter your marks: ");
		marks = Integer.parseInt(obj.nextLine());
		System.out.println("Subject Name: "+subject);
		System.out.println("Marks secured: "+ marks);
	}
	/* We are reading from the user and displaying it. The moment we close the Eclipse, the data 
	 * does not persist anywhere. Only during the run time , when we execute the program the data shows
	 * in the output otherwise it does not persist. So to persist the data either we should learn how to save 
	 * the details in file or how to save the details in database.
	 */
// TO read the data from the file
		// Step1: Create the file and save the data there.
		//Create file object and give the path. */
		File f = new File ("E:\\Programming\\Java\\Simplilearn\\Phase 1\\Push to Git\\Projects\\LearningConceptsProjects\\WorkingWithFiles1\\Score.txt");
		FileReader fr = new FileReader(f); // FileReader will read the file char by char
		//We added throws exception if the program is unable to read the file.
		//Read the first character in ASCII number
		int i = fr.read(); //This is a method. //This line is giving error what if there is no character. so we added io exception
		while (i != -1)
		{
			System.out.print((char)i); // Char is written to ge the value in character not in integer.
			i = fr.read(); // This statement is written to read the next character
		}
		fr.close(); 
	}
		}

