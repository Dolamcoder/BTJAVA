package baitap00p1;

public class InvoiceItem {
private String id;
private String desc;
private int qty;
private double unitPrice;
public InvoiceItem(String id, String desc, int qty, double unitPrice)
{
	this.id=id;
	this.desc=desc;
	this.unitPrice=unitPrice;
	this.qty=qty;
}
public String getId()
{
	return this.id;
}
public String getDesc()
{
	return this.desc;
}
public int getQty()
{
	return this.qty;
}
public double getunitPrice()
{
	return this.unitPrice;
}
public void setQty(int a) {
	this.qty=a;
}
public void setunitprice(double b)
{
	this.unitPrice=b;
}
public double getTotal()
{
	return this.unitPrice*this.qty;
}
public String tostring()
{
	return "InvoiceItem[id="+this.id+",desc="+this.desc+",qty="+this.qty+",unitprice="+this.unitPrice+"]";
}
}
