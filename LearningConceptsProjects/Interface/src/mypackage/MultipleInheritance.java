package mypackage;

interface IFirst
{
	
}
interface ISecond
{
	
}
class Third
{
	
}
class MyDerivedClass implements IFirst, ISecond
{
	//Therefore, multiple inheritance is supported in interface.
}
class MyDerivedClass1 extends Third implements ISecond
{
	
}
public class MultipleInheritance {

}
