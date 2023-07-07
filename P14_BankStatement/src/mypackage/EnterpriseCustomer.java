package mypackage;

public class EnterpriseCustomer extends Customer
{
	//Class Variables
	String customerID;
	String customerName;
	String customerType;
	double amount;
	
	//Constructor
	EnterpriseCustomer(String custID, String custName, String custType, double amt) 
	{
		super(custID, custName, custType);
		this.customerID = custID;
		this.customerName = custName;
		this.customerType = custType;
		this.amount = amt;
	}
	//Method
	@Override
	double get_final_amount(double interest, int year) 
	{
	double simple_interest = this.amount * interest * year;
	double amount = this.amount + simple_interest;
	
	//Flat 500 rupees discount for all the enterprise customers
	amount = amount - 500 ;
	if (this.customerType == "SmallScale")
	{
		// For regular customer type we are giving 500 rupees discount
		return amount - 100;
	}
	else if (this.customerType == "Big Scale")
	{
		// No discount for business customers
		return amount;
	}
	// besides the above customer types we will return the amount calculated
	return amount;	
	}
}
