class employee
{
	void display()
	{
		System.out.println("employee");
	}
	void calc_salary()
	{
		System.out.println("Salary of the employee is 10000");
	}
}
class engineer extends  employee
{
	void display()
	{
	super.display();
	}
	void calc_salary()
	{
		System.out.println("the salary of the employee is 20000");
	}
}
class eng
{
	public static void main(String args[])
	{
	engineer e=new engineer();
	e.display();
	e.calc_salary();
	}
}
