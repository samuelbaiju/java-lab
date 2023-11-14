import java.util.*;
class mul
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
	int num3[][]=new int [r][c];
	for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
		num3[i][j]=0;
	for(int k=0;k<r;k++)
		{
		num3[i][j]+=num2[i][k]*num1[k][j];
		}
	}
	}
	System.out.println("The resultant is: ");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			System.out.print(num3[i][j]+" ");
		}
		System.out.println();
	}
	}
}
