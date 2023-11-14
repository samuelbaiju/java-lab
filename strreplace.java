import java.util.Scanner;
class repstring
{
	public static void main(String[]args)
	{
	char k,c;
	int i;
	Scanner sc=new Scanner(System.in);
	String str1;
	System.out.println("enter the string");
	str1=sc.next();
	System.out.println("enter the char to be replaced");
	k=sc.next().charAt(0);
	System.out.println("enter new character");
	c=sc.next().charAt(0);
	int l=str1.length();
	for(i=0;i<l;i++)
	{
		if(k==str1.charAt(i))
			{
			str1=str1.replace(str1.charAt(i),c);
		}
	}
	System.out.println(str1);
	}
}
