package btoop2;

public class Invoice {
private int id;
private Customer customer;
private double amount;
public Invoice(int id, Customer customer, double amount)
{
	this.id=id;
	this.customer=customer;
	this.amount=amount;
}
public int getId()
{
	return this.id;
}
public Customer getCustomer()
{
	return this.customer;
}
public void setCustomer(Customer customer)
{
	this.customer=customer;
}
public void setAmount(double amount)
{
	this.amount=amount;
}
public double getAumount()
{
	return this.amount;
}
public int getCustomerId()
{
	return customer.getId();
}
public String getCustomerName()
{
	return customer.getName();
}
public int getCustomerDiscount()
{
	return customer.getDiscount();
}
public double getAmountAfterDiscount()
{
	return this.amount-this.amount*customer.getDiscount()/100.0;
}
public String tostring()
{
	return "Invoice[id="+this.id+",customer="+customer.tostring()+",amount="+this.amount+"]";
}
}
