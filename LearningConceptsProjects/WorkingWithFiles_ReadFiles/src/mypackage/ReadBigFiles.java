package mypackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadBigFiles {

	public static void main(String[] args) throws IOException {
		var allLines = Files.readAllLines(Paths.get("E:\\Programming\\Java\\Simplilearn\\Phase 1\\Push to Git\\Projects\\LearningConceptsProjects\\WorkingWithFiles1\\Result.txt"));
		for (var r:allLines)
			System.out.println(r);
	}

}
