
public class EmployeeMain {
public static void main(String[] args)
{
Employee s[]=new Employee[3];
//Employee s1[]=new Employee[3];
s[0]=new Employee(1,"ram",100);
s[1]=new Employee(2,"shyam",200);
s[2]=new Employee(3,"ravi",300);
s[0].setSalary(100);
s[1].setSalary(200);
s[2].setSalary(300);

EmployeeMain ui=new EmployeeMain();
ui.print(s);

}

public void print(Employee s[]) {
for(int i=0;i<3;i++)
{
System.out.println(s[i].getid());
System.out.println(s[i].getName());
System.out.println(s[i].getSalary());
System.out.println(s[i].getBalance());

}
}



}
