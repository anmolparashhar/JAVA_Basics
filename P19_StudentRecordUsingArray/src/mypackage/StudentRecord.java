package mypackage;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class StudentRecord implements Comparable
{
	String name;
	int rollNumber;
	String address;
	
	//Constructor to initialize the Student Name, roll number and address
	StudentRecord(String name, int rollNumber, String address)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.address = address;
	}
	//Formatting Roll Number, name and address
	public String toString()
	{
		return this.rollNumber + " " + this.name + " " + this.address;
	}
	
	public static void main(String[] args) 
	{
		List stud = new ArrayList();
		
		//Adding Students record here
		stud.add(new StudentRecord("Sapna", 1005, "Dharamshala"));
		stud.add(new StudentRecord("Girija", 1003, "Kullu"));
		stud.add(new StudentRecord("Shiv", 1006, "Lahul"));
		stud.add(new StudentRecord("Anmol", 1001, "Mandi"));
		stud.add(new StudentRecord("Shyam", 1007, "Manali"));
		stud.add(new StudentRecord("Rajender", 1004, "Kangra"));
		stud.add(new StudentRecord("Divya", 1002, "Chamba"));
		
		//Sorting the students data
		Collections.sort(stud);
		System.out.println("The list after sorting: "+stud);
		
		//Sorting by roll number
		System.out.println("After sorting by roll number\n");
		for (int i = 0; i<stud.size(); i++)
			System.out.println(stud.get(i));
	}
		
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.rollNumber - ((StudentRecord)o).rollNumber;
	}

}
