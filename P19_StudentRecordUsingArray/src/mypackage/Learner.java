package mypackage;

public class Learner 
{
	int rollno;
	String courseName;
	String location;
	
	//Learner Class Constructor
	public Learner (int rollno, String courseName, String location)
	{
		this.rollno = rollno;
		this.courseName = courseName;
		this.location = location;
	}
	
	//Printing Learner Data
	public String toString()
	{
		return this.rollno + " " + this.courseName + " " + this.location;
	}
}
