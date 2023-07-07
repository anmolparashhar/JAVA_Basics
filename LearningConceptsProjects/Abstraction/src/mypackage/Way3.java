package mypackage;

public class Way3 {
	abstract class Cognizant{
	public int getHRA (int basic) {
	return 40*basic/100; }
	public int getPF (int basic) {
	return 12*basic/100; }
	public abstract int getCA();
	public abstract int getSA();
	/*Here, if we forget to write any method in the Accenture and 
	 * Microsoft class then we will get error.
	 */
	class Accenture extends Cognizant {

		@Override
		public int getCA() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getSA() {
			// TODO Auto-generated method stub
			return 0;
		}
	
	}
	class Microsoft extends Cognizant{
// Here, we have not written the methods so it is giving error.
	}

}
