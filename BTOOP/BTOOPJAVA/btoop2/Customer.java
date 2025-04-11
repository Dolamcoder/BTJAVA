package btoop2;
public class Customer {
private int id;
private String name;
private int discount;
public Customer(int id, String name, int discount)
{
	this.id=id;
	this.name=name;
	this.discount=discount;
}
public int getId()
{
	return this.id;
}
public String getName()
{
	return this.name;
}
public int getDiscount()
{
	return this.discount;
}
public void setDiscount(int x)
{
	this.discount=x;
}
public String tostring()
{
	return this.name+"("+this.id+")("+this.discount+"%)";
}
}
