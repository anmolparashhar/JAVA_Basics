package mypackage;

public class BankAccount {

	public static void main(String[] args) 
	{
		RegularCustomer regCustomer1 = new RegularCustomer ("R123", "Anmol", "Domestic", 50000);
		RegularCustomer regCustomer2 = new RegularCustomer ("R124", "Girija", "Business", 80000);
		
		EnterpriseCustomer entCustomer1 = new EnterpriseCustomer("E555", "Rajender", "SmallScale",90000);
		EnterpriseCustomer entCustomer2 = new EnterpriseCustomer("E777", "Sapna", "LargeScale",95000);
		
		//Regular Customer
		regCustomer1.showCustomerDetails();
		System.out.println("Final Amount: "+regCustomer1.get_final_amount(5, 8));
		regCustomer2.showCustomerDetails();
		System.out.println("Final Amount: "+regCustomer2.get_final_amount(5, 8));
		//Enterprise Customer
		entCustomer1.showCustomerDetails();
		System.out.println("Final Amounnt: "+entCustomer1.get_final_amount(5, 8));
		entCustomer2.showCustomerDetails();
		System.out.println("Final Amounnt: "+entCustomer2.get_final_amount(5, 8));
	}

}
