import java.util.*;
class student
{
	static String name;
	static int rollno;
	static int marks[]=new int[5];
	static void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("enter the roll no");
		rollno=sc.nextInt();
		System.out.println("enter the marks");
		for(int i=0;i<5;i++)
		{
		marks[i]=sc.nextInt();
		}
	}
	static void print()
	{	
		System.out.println("Enter the name of the student"+name);
		System.out.println("the roll no of the student"+rollno);
		for(int i=0;i<5;i++)
		{
		System.out.println("the mark of the subject"+marks[i]);
		}
	}
	public static void main(String args[])
	{
		read();
		print();
	}
}
