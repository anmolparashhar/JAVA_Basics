package mypackageoverridden;

public class EnglishMessage 
{
	public void SayHi()
	{
	System.out.println("Hi");
	}
	public void SayHello()
	{
	System.out.println("Hello"); 
	}
	public void SayGM()
	{
	System.out.println("Good Morning"); 
	}
}
//When we inherited a class, all the methods will come to the derived class so if we don’t need any method in the derived class, we can directly override the method in the derived class 
//(that means we are giving a new definition by putting @Override