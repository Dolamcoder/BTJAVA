package btoop2;

public class Book {
private String name;
private Author[] authors;
private Author author;
private double price;
private String isbn;
private int qty=0;
public Book(String name, Author[] authors, double price, int qty) {
	this.name=name;
	this.authors=authors;
	this.price=price;
	this.qty=qty;
}
public Book(String name, Author author, double price, int qty) {
	this.name=name;
	this.author=author;
	this.price=price;
	this.qty=qty;
}
public Book(String isbn, String name, Author author, double price, int qty) {
	this.isbn=isbn;
	this.name=name;
	this.author=author;
	this.price=price;
	this.qty=qty;
}
public String getIsbn()
{
	return this.isbn;
}
public String getName()
{
	return this.name;
}
public double getPrice()
{
	return this.price;
}
public Author getAuthor()
{
	return this.author;
}
public void setPrice(double price)
{
	this.price=price;
}
public int getQty()
{
	return this.qty;
}
public void setQty(int x)
{
	this.qty=x;
}
public String getAuthorName()
{
	String s="";
	for(int i=0;i<authors.length;i++)
	{
		s+=authors[i].tostring()+" ,";
	}
	return s;
}
public String getAuthorName1()
{
	return this.author.tostring();
}
public String tostring()
{
	return "Book[name="+this.name+","+getAuthorName()+",price="+this.price+",qty="+this.qty+"]";
}

public String tostring1()
{
	return "Book[name="+this.name+","+this.author.tostring()+",price="+this.price+",qty="+this.qty+"]";
}
}
