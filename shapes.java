import java.util.*;
class prgm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		shapes s1=new shapes();
		System.out.println("the radius of the circle");
		int a=sc.nextInt();
		s1.area(a);
		System.out.println("the length and breadth of the rectangle");
		int l=sc.nextInt();
		int b=sc.nextInt();
		s1.area(l,b);
		System.out.println("the base and height of the circle");
		int base=sc.nextInt();
		int h=sc.nextInt();
		int t=sc.nextInt();
		s1.area(base,h,t);
	}
}
class shapes
{
	void area(int x)
	{
	System.out.println("The area of the circle"+(3.14*x*x));
	}
	void area(int x,int y,int z)
	{
	System.out.println("The area of the triangle is "+(.5*x*y));
	}
	void area(int x, int y)
	{
	System.out.println("The area of the rectangle"+y));
	}
}
