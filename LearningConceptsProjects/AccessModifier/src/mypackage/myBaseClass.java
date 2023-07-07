package mypackage;

public class myBaseClass
{
	public int a;
	private int b;
	protected int c;
	int d;
	public void myBaseClassMethod()
	{
		a = 5;
		b = 10;
		c = 15;
		d = 20;
	}
}

class myDerivedClass extends myBaseClass
{
	public void myDerivedClassMethod()
	{
		a = 5;
		b = 10;
		c = 15;
		d = 20;
	}
}
class myOtherClass
{
	public void myOtherClassMethod()
	{
		myBaseClass mb = new myBaseClass();
		mb.a=5;
		mb.b=10;
		mb.c=15;
		mb.d=20;
	}
}
