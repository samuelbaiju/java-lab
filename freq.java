import java.util.Scanner;
class freq
{
	public static void main(String[]args)
	{
	int flag=0;
	Scanner sc=new Scanner(System.in);
	String str;
	System.out.println("enter the string");
	str=sc.next();
	System.out.println("Enter the element whose frequency should be found");
	char c=sc.next().charAt(0);
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==c)
		{
			flag++;
		}
	}
	System.out.println("the frequemcy of the element is"+flag);
	}
}

