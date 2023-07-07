package otherpackage;
import mypackage.myBaseClass;

class otherPackageDerivedClass extends myBaseClass
{
	public void otherPackageDerivedClassMethod()
	{
		a = 5;
		b = 10;
		c = 15;
		d = 20;
	}
}
class otherPackageOtherClass
{
	public void otherPackageOtherClassMethod()
	{
		myBaseClass mb = new myBaseClass();
		mb.a=5;
		mb.b=10;
		mb.c=15;
		mb.d=20;
	}
}
public class myclass {

}
