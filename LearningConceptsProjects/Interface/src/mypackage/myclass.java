package mypackage;

import java.util.Scanner;

interface IShape
{
	void getArea();
	void getPerimeter();
}

class Circle implements IShape
{
	int r;
	double area;
	double perimeter;
	public void getRadius()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("This program is written to find the area and perimeter: ");
		System.out.println("Enter the radius: ");
		r = obj.nextInt();
		obj.close();
	}
	@Override
	public void getArea() {
		area = (Math.PI * r * r);
		System.out.println("The area of circle is: " + area);
	}

	@Override
	public void getPerimeter() {
		perimeter = 2* Math.PI * r;
		System.out.println("The perimeter of circle is: "+perimeter);
	}
	
}

class Rectangle implements IShape
{
	int l;
	int b;
	int area;
	int perimeter;
	
	public void getInput()
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the length: ");
	l = obj.nextInt();
	System.out.println("Enter the breadth: ");
	b = obj.nextInt();
	obj.close();
	}
	
	@Override
	public void getArea() {
		area = l*b;
		System.out.println("The area of rectangle is: "+area);
	}

	@Override
	public void getPerimeter() {
		perimeter =  2 * (l+b);
		System.out.println("The perimeter of rectangle is: " + perimeter);
	}
	
}

public class myclass {

	public static void main(String[] args) {
		System.out.println("Program Ends.");

	}
 
}
