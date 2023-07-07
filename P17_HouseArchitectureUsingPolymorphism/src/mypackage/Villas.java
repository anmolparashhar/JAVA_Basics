package mypackage;

public class Villas extends HouseArchitecture
{

	@Override
	float getPrice() {
		// The Price of Villa is 2 Crore
		return 20000000;
	}

	@Override
	String getLoanBank() {
		return "ICICI, AXIS, HDFC";
	}

}
