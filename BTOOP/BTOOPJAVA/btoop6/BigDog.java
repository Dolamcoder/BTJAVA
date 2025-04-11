package btoop6;

public class BigDog extends Dog{
public BigDog(String name)
{
	super(name);
}
public void greets()
{
	System.out.println("wooow");
}
public void greets(Dog another)
{
	System.out.println("wooooow");
}
public void greets(BigDog another)
{
	System.out.println("wooooooooooooooooow");
}
}
