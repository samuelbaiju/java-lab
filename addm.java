import java.util.*;
class addm
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int c,i,j,r,f=0;
	System.out.println("enter the size of the rows and coloumns");
	r=sc.nextInt();
	c=sc.nextInt();
	int num1[][]=new int [r][c];
	int num2[][]=new int [r][c];
	int num3[][]=new int [r][c];
	System.out.println("enter the elements");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			num1[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			num2[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			num3[i][j]=num1[i][j]+num2[i][j];
		}
	}
	System.out.println("the added matrix");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			System.out.println(num3[i][j]+" ");
		}
		System.out.println();
	}
}
}	
