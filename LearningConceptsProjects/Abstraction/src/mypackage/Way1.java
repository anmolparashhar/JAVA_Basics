package mypackage;

public class Way1 {
	/*This is not a good code because there is a duplicate code. 
	 * Like we are processing salaries for different companies. 
	 * We can have ‘n’ number of companies. 
	 * The getHRA and getPF method is similar for everyone and getCA, 
	 * getSA is different for every company.
	 */
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

	class Accenture {
	public int getHRA (int basic) {
	return 40*basic/100; }
	public int getPF (int basic) {
	return 12*basic/100; }
	public int getCA (int basic) {
	return 4000; }
	public int getSA (int basic) {
	return 10000; }
	}
	class Microsoft {
	public int getHRA (int basic) {
	return 40*basic/100; }
	public int getPF (int basic) {
	return 12*basic/100; }
	public int getCA (int basic) {
	return 8000; }
	public int getSA (int basic) {
	return 20000; }
	}

}
