
public class Employee {
private int id;
Employee(int id,String name, int balance)
{this.id=id;
this.name=name;
this.balance=balance;
	}

public int getid()
{
return id;	
}
public void setid(int id)
{
this.id=id;	
}
private String name;
public String getName()
{ 
	return name;
	}
public void setName(String name)
{
 this.name=name;	
}

private int balance;
public int getBalance()
{
	return balance;
}
public void setBalance(int balance)
{
this.balance=balance;
}

private int salary;
public int getSalary()
{
return salary;	
}
public void setSalary(int salary)
{
	this.salary=salary;
balance=salary+balance;
}
}

