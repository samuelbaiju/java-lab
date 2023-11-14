import java.util.*;
class lmat
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int c,i,j,r,f=0;
	System.out.println("enter the size of the rows and coloumns");
	r=sc.nextInt();
	c=sc.nextInt();
	int num[][]=new int [r][c];
	System.out.println("enter the elements");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			num[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			f=num[0][0];
			if(f<num[i][j])
			{
				f=num[i][j];
			}
		}
	}
	System.out.println(f);
}
}
