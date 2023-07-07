package mypackage;

public class ThreadClass implements Runnable 
{
	Thread thread;
	String threadName;
	
	ThreadClass(String name)
	{
		this.threadName = name;
		System.out.println("Creating thread "+this.threadName);
	}
	
	public void run()
	{
		System.out.println("Running thread "+this.threadName);
		try
		{
			for(int i = 5; i>0; i--)
			{
				System.out.println("Thread Name: "+this.threadName+" "+i);
				Thread.sleep(50);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Thread with Name: "+this.threadName+" is stopped in between");
		}
		System.out.println("Thread with thread name" + this.threadName + "exited");
	}
	public void start()
	{
		System.out.println("Starting Thread with thread name" + this.threadName);
		if (thread == null) 
		{
			thread = new Thread (this, this.threadName);
			thread.start();
		}
	}
}
