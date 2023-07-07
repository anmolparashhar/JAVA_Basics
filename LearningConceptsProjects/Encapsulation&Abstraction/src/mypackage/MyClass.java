package mypackage;

public class MyClass {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(121,"Anmol Prashar",150000);
		Employee emp2 = new Employee();
		emp1.printData();
		emp2.readData();
		emp2.printData();
	}

}
