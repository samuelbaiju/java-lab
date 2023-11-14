import java.util.*;
class emp
{
	String name;
	int empno;
	int phnno;
	emp(int empno, int phnno,String name)
	{
	this.name=name;
	this.empno=empno;
	this.phnno=phnno;
	}
	void display()
	{
	System.out.println("the employee no is "+empno+" phn no "+phnno+" name "+name);
	}
}
class employee
{
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		emp e[]=new emp[5];
		String name;
		int empno,phnno;
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("enter the emp no");
		empno=sc.nextInt();
		System.out.println("enter the phone no");
		phnno=sc.nextInt();
		e[i]=new emp(empno,phnno,name);
		}
	
		for(int i=0;i<5;i++)
		{
		e[i].display();
		}
	}
}
