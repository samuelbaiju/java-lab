class odd extends Thread
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd="+i);
			}
		}
	}
}
class even extends Thread
{
	public void run()
	{
		for(int i=2;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even="+i);
			}
		}
	}
}
class Multithreading
{
	public static void main(String args[])
	{
		even e=new even();
		odd o=new odd();
		e.start();
		o.start();
	}
}
