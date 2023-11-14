import java.util.*;
class trace
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int c,i,j,r,f=0;
	System.out.println("enter the size of the rows and coloumns");
	r=sc.nextInt();
	c=sc.nextInt();
	int num1[][]=new int [r][c];
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
			if(i==j)
			{
				f=f+num1[i][j];
			}
		}

	}
	System.out.println("the trace of the matrix is"+f);
	
	
}
}
