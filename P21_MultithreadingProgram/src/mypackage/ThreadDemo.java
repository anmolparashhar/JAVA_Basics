package mypackage;
public class ThreadDemo 
{

	public static void main(String[] args) 
	{
		ThreadClass t1 = new ThreadClass("Thread1");
		t1.start();
		
		ThreadClass t2 = new ThreadClass("Thread2");
		t2.start();


	}

}

