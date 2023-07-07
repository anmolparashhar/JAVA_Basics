import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OverwriteLine {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Programming\\Java\\Simplilearn\\Phase 1\\Push to Git\\Projects\\LearningConceptsProjects\\WorkingWithFiles-WritingIntoFiles\\Overwrite_Writingwithfiles.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("This will overwrite what is written previously.");
		fw.close();
		System.out.println("Writing Successful.");
	}

}