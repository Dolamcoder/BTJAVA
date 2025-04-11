package btoop2;
public class Account {
private int id;
private Customer customer;
private double balance;
public Account(int id, Customer customer, double balance) {
	this.id=id;
	this.customer=customer;
	this.balance=balance;
}
public Account(int id, Customer customer)
{
	this.id=id;
	this.customer=customer;
}
public int getId()
{
	return this.id;
}
public Customer getCustomer()
{
	return this.customer;
}
public double getBalance()
{
	return this.balance;
}
public void setBalance(double x)
{
	this.balance=x;
}
public String tostring()
{
	return this.customer.getName()+"("+this.id+")  "+"balance=$"+this.balance;
}
public String getCustomerName()
{
	return this.customer.getName();
}
public Account deposit(double amount)
{
	this.balance+=amount;
	return this;
}
public Account withdraw(double amount)
{
	if(this.balance>=amount)
	{
		this.balance-=amount;
	}
	else System.out.println("amount withdraw axceeds the current balnace!");
	return this;
}
}
