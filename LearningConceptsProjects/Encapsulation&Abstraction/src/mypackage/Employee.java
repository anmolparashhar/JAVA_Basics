package mypackage;

import java.util.Scanner;

public class Employee {
	//We are making the variable private so that it can not accessed outside class.
private int id;
private String name;
private int salary;
// If a variable is common for all the objects then we will write static and access it by class name.
private static String company = "Microsoft";
//Always declare variable as private so that it can be only accessed by methods.

/*If we don't want to read the data from the users and want to initialize the data then we will use constructor.
 * to create constructor we will use the same name of constructor as class name.
 */
/*public Employee (int eid, String ename, int esalary) {
	id = eid;
	name = ename;
	salary = esalary;
}*/
// if we want to keep the same name as class attributes in parameter while creating constructor, we use this.
public Employee (int id, String name, int salary)
{
	this.id  = id;
	this.name = name;
	this.salary = salary;
}
/* We can create n numbers of constructor in a class.
 * Here, when we created the constructor the default constructor gone. We can create the default constructor again 
 * to print the default values of the variable.
 */
public Employee()
{
	int id = 0;
	String name = "null";
	int salary = 0;
}

// The read method is to read data from users.
public void readData() 
{
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the id: ");
	id = Integer.parseInt(obj.nextLine());
	System.out.println("Enter the name: ");
	name = obj.nextLine();
	System.out.println("Enter the salary: ");
	salary = Integer.parseInt(obj.nextLine());
	obj.close();
}
// The print method is to print the data.
public void printData()
{
	System.out.println("The id is: "+ id);
	System.out.println("The name is: "+ name);
	System.out.println("The Salary is: "+ salary);
	System.out.println("The company name is: "+ Employee.company);
	// We can directly access  the company name by class name.
}
}
