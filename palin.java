import java.util.*;
class palin
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	String str;
	System.out.println("enter the string");
	str=sc.next();
	int a=chpalin(str);
	if(a==1)
	System.out.println("true");
	else
	System.out.println("false");
	}
	public static int chpalin(String str)
	{
	String rev;
	rev="";
	int ans =0;
	for(int i=str.length()-1;i>=0;i--)
	{
	rev=rev+str.charAt(i);
	}
	if(rev.compareTo(str)==0)
	{
	ans=1;
	}
	return ans;
	}
} 
