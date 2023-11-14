import java.util.*;
class sarray
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int n,i,s=0;
	System.out.println("enter the size of the array");
	n=sc.nextInt();
	int num[]=new int [n];
	for(i=0;i<n;i++)
	{
	num[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
	s=num[0];
	if(s>num[i])
	{
		s=num[i];
	}
	}
		System.out.println(s);
}
}
	
