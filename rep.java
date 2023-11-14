import java.util.*;
class rep
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int n,i,f,j,r;
	System.out.println("enter the size of the array");
	n=sc.nextInt();
	int num[]=new int [n];
	System.out.println("enter the elements");
	for(i=0;i<n;i++)
	{
	num[i]=sc.nextInt();
	}
	System.out.println("enter the index and element to be replaced");
	f=sc.nextInt();
	j=sc.nextInt();
	System.out.println("elemnt with which it should be replaced");
	r=sc.nextInt();
	num[f]=r;
	System.out.println("print the new array");
	for(i=0;i<n;i++)
	{
	System.out.println(num[i]+" ");
	}
}
}
