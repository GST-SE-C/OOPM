/*

Abstrakt Class Props

> It can have one or more abstrakt methods
> These methods should be implemented or overridden by it's subclasses
> We cannot instantiate abstrakt class because some methods are INCOMPLETE (declaration only)
> It can have Concrete Methods also
> Concrete Methods are called using subclass' object
> Abstrakt methods cannot be static
	 - Concrete methods can be ...

*/

abstract class Figure
{
	double d1,d2;

	Figure(double a, double b)
	{
		d1=a;
		d2=b;
	}

	abstract double area();
}

class Rekt extends Figure
{
	Rekt(double c, double d)
	{
		super(c,d);
	}

	double area()
	{
		return d1*d2;
	}
}

class RektDemo
{
	public static void main(String args[])
	{
		Rekt r = new Rekt(2,3);
		System.out.println("Area : " + r.area());

		// Oops! This cannot be done
		// Figure f1 = new Figure(3,4);
		Figure f2; // Creating a 'Figure' Reference
		f2=r;	   // Providing it a copy of subclass
		// So it's a Skeleton of Figure, and Content from Rekt

		System.out.println("Abstrakt Area : " + f2.area());
		// ^ This would eventually call subclass' method area()
	}
}
