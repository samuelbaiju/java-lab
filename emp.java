class employee
{
	String name;
	int age;
	int phonenumber;
	String address;
	int salary;
	void print_salary()
	{
		System.out.println("the salary of the employee is"+salary);
	}
	void together()
	{
		System.out.println(name+age+phonenumber+address);
	}
}
class officer extends employee
{
	String specialization;
	void display()
	{
		System.out.println(specialization);
	}
}
class manager extends employee
{
	String department;
	void display()
	{
		System.out.println(department);
	}
}
class emp
{
	public static void main(String args[])
	{
		officer o=new officer();
		o.name="samuel";
		o.age=19;
		o.phonenumber=545345;
		o.address="mala,thrissur";
		o.salary=20000;
		o.specialization="ophthamology";
		o.display();
		o.together();
		o.print_salary();
		manager m=new manager();
		m.name="das";
		m.age=20;
		m.phonenumber=56536345;
		m.address="malapallipuram,thrissur";
		m.salary=25000;
		m.department="medical";	
		m.display();
		m.together();
		m.print_salary();
	}
}
