package mypackage;

public class FarmHouse extends HouseArchitecture
{

	@Override
	float getPrice() {
		// The price of Farm House is 10 Crore
		return 100000000;
	}

	@Override
	String getLoanBank() {
		return "HDFC";
	}

}
