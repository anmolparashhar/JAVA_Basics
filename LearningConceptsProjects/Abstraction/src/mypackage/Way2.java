package mypackage;

public class Way2 {
	
	class Cognizant{
	public int getHRA (int basic) {
	return 40*basic/100; }
	public int getPF (int basic) {
	return 12*basic/100; }
	public int getCA (int basic) {
	return 6000; }
	public int getSA (int basic) {
	return 12000; }
	}
	class Accenture extends Cognizant {
	public int getCA (int basic) {
	return 4000; }
	public int getSA (int basic) {
	return 10000; }
	}
	class Microsoft extends Cognizant{
	public int getCA (int basic) {
	return 8000; }
	//Example : For Microsoft or programmer forget to write getSA
	public int getSA (int basic) {
	return 20000; }
	}
}
/*Still, it is not the best code because in Microsoft class if a person 
 * forget to write a getSA method then the payment/salary for Microsoft will be 
 * processed without SA.So, to avoid this problem we use the Abstraction class.
 */