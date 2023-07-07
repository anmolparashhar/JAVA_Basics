package mypackage;

public class CheckPolymorphism {

	public static void main(String[] args) 
	{
		HouseArchitecture ha;
		ha = new Villas();
		System.out.println("Average Price of the villas are: "+String.format("%.0f",ha.getPrice()));
		System.out.println("Banks who can provide loan are: "+ha.getLoanBank());
		
		ha = new FarmHouse();
		System.out.println("Average Price of the Farm House are: "+String.format("%.0f",ha.getPrice()));
		System.out.println("Banks who can provide loan are: "+ha.getLoanBank());
		
		ha = new Apartments();
		System.out.println("Average Price of the Apartments are: "+String.format("%.0f",ha.getPrice()));
		System.out.println("Banks who can provide loan are: "+ha.getLoanBank());
	}

}
