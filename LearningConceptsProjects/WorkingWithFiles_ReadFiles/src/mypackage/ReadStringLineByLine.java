package mypackage;
//This way is used to read the data for small files.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadStringLineByLine {

	public static void main(String[] args) throws IOException {
		File f = new File ("E:\\Programming\\Java\\Simplilearn\\Phase 1\\Push to Git\\Projects\\LearningConceptsProjects\\WorkingWithFiles1\\Result.txt");
		FileReader fr = new FileReader(f); // FileReader will read the file char by char
		BufferedReader br = new BufferedReader(fr); // FileRead will read the file 
		//We added throws exception if the program is unable to read the file.
		//Read the first line
		String line = br.readLine(); // To read the line
		while (line != null)
		{
			System.out.println(line); // Char is written to ge the value in character not in integer.
			line = br.readLine(); // This statement is written to read the next Line
		}
		br.close(); 
	}

	}

