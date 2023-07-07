package mypackage;
import java.util.*;
public class StudentRecord2 
{
	public static void main(String[] args) 
	{
		ArrayList<Learner> arr = new ArrayList<Learner>();
		arr.add(new Learner(1234567, "Pyhton", "US"));
		arr.add(new Learner(1234562, "Java", "India"));
		arr.add(new Learner(1234565, "PHP", "Australia"));
		arr.add(new Learner(1234561, "C#", "NewYork"));
		arr.add(new Learner(1234563, "C++", "UK"));
		arr.add(new Learner(1234566, "C", "Italy"));
		arr.add(new Learner(1234564, "Ruby", "Russia"));
		
		//Data before sorting
		System.out.println("Data before sorting");
		for (int i=0; i<arr.size(); i++)
			System.out.println(arr.get(i));
		
		//Data After Sorting
		Collections.sort(arr, new Sortbyrollno());
		System.out.println("Data after sorting");
		for (int i = 0; i<arr.size(); i++)
			System.out.println(arr.get(i));
	}
}


class Sortbyrollno implements Comparator<Learner>
{
	//sorting in ascending order of roll number
	public int compare(Learner a, Learner b)
	{
		return a.rollno - b.rollno;
	}
}