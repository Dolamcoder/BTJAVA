package baitap00p1;
public class Employee {
private int id;
private String firtname, lastname;
private int salary;
public Employee(int id, String firtname, String lastname, int salary) {
	this.id=id;
	this.firtname=firtname;
	this.lastname=lastname;
	this.salary=salary;
}
public int getId()
{
	return this.id;
}
public String getFirtname()
{
	return this.firtname;
}
public String getLastname()
{
	return this.lastname;
}
public int getSalary()
{
	return this.salary;
}
public int getAnnualSalary()
{
	return this.salary*12;
}
public int raiseSalar(double x)
{
	this.salary=(int) (this.salary+this.salary*x/100);
	return this.salary;
}
public String tostring()
{
	return "Employee[id="+this.id+",name="+this.firtname+" "+this.lastname+",salary="+this.salary+"]";
}
}
