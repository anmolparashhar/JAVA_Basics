package mypackage;

public class RegularCustomer  extends Customer
{
	//Class Variables
		String customerID;
		String customerName;
		String customerType;
		double amount;
		// Constructor
	RegularCustomer(String custID, String custName, String custType, double amt) 
	{
		super(custID, custName, custType);
		this.customerID = custID;
		this.customerName = custName;
		this.customerType = custType;
		this.amount = amt;
	}
	    //Method
		@Override
		double get_final_amount(double interest, int year) {
			double simple_interest = this.amount * interest * year;
			double amount = this.amount + simple_interest;
			if (this.customerType == "Domestic")
			{
				//For regular customer we are discounting 500 rupees
				return amount-500;
			}
			else if (this.customerType == "Business")
			{
				// No discount for business customers
				return amount;
			}
			// besides the above customer types we will return the amount calculated
			return amount;
		}
}
