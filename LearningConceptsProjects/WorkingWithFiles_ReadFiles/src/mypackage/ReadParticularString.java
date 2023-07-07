
//This is used to read the data of medium size. ( 500-1000 Words)
package mypackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadParticularString {

	public static void main(String[] args) throws IOException {
		Scanner obj = new Scanner(System.in);
		String subject;
		System.out.println("Enter subject name: ");
		subject = obj.nextLine();
		boolean isFound = false;
		
		File f = new File ("E:\\Programming\\Java\\Simplilearn\\Phase 1\\Push to Git\\Projects\\LearningConceptsProjects\\WorkingWithFiles1\\Result.txt");
		FileReader fr = new FileReader(f); // FileReader will read the file char by char
		BufferedReader br = new BufferedReader(fr); // FileRead will read the file 
		//We added throws exception if the program is unable to read the file.
		//Read the first line
		String line = br.readLine(); // To read the line
		while (line != null)
		{
			var data = line.split(",");
			if (data[0].equals(subject)) {
				System.out.println(data[1]);
				isFound = true;
				break;
			}
			line = br.readLine();
		}
		br.close();
		if (isFound == false)
			System.out.println("Subject not found.");
	}

}
