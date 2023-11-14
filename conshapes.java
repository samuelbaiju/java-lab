import java.util.*;
class shapes
{
	int radius;
	int length; 
	int breadth;
	shapes(int radius)
	{
	float peri=(2*22*radius)/7;
	System.out.println("the perimeter of the circle"+peri);
	}
	shapes(int length ,int breadth)
	{
	int peri=2*(length+breadth);
	System.out.println("the perimeter of the rectangle"+peri);
	}
}
class conshapes
{
	public static void main(String args[])
	{
	shapes s=new shapes(3);
	shapes c=new shapes(2,4);
	}
}

