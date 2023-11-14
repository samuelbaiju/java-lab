public class Main
{
public static void main(String args[])
{
int a,f=0,i;
a=23;
for(i=2;i<=a/2;i++)
{ 
	if(a%i==0)
	{
	f=1;
	}
}
if(f==0)
System.out.println("The no. is prime");
if(f==1)
System .out .println("the no is not prime");
}
}
	
