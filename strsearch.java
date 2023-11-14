import java.util.Scanner;
class palin
{
	public static void main(String[]args)
	{
	int flag=0;
	Scanner sc=new Scanner(System.in);
	String str;
	System.out.println("enter the string");
	str=sc.next();
	System.out.println("enter the element to be searched");
	char c=sc.next().charAt(0);
	for(int i=0;i<str.length();i++)
	{
	if(str.charAt(i)==c)
	{
	flag=1;
	}
	}
	if(flag==0)
	{
	System.out.println("the element is not found");
	}
	else
	{
	System.out.println("the element is found");
	}
	}
}
	
	
