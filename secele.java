import java.util.*;
class secele
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int n,i,f=0,j,r=0;
	System.out.println("enter the size of the array");
	n=sc.nextInt();
	int num[]=new int [n];
	System.out.println("enter the elements");
	for(i=0;i<n;i++)
	{
	num[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(num[j]>num[j+1])
			{
				int t=num[j];
				num[j]=num[j+1];
				num[j+1]=t;
			}
		}
	}
	System.out.println("the second largest element in the array");
	System.out.println(num[n-2]);
}
}
