public class Main
{
public static void main(String args[])
{
int a;
int n,s=0,b;
a=256;
b=a;
while(b>0)
{
n=b%10;
s=s*10+n;
b=b/10;
}
System.out.println(s);
}
}
