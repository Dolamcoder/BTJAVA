package btoop2;

public class Author {
private String name;
private String email;
private char gender;
public Author(String name, String email, char gender) {
	this.name=name;
	this.email=email;
	this.gender=gender;
}
public Author(String name, String email)
{
	this.name=name;
	this.email=email;
}
public String getName()
{
	return this.name;
}
public String getEmail()
{
	return this.email;
}
public void setEmail(String a)
{
	this.email=a;
	
}
public char getGender() {
	return this.gender;
}
public String tostring()
{
	return "Author[name="+this.name+",email="+this.email+",gender="+this.gender+"]";
}
}
