package btoop6;

public class Dog extends Animal {
public void greets() {
System.out.println("Woof");
}
public Dog(String name) {
	super(name);
}
public void greets(Dog another)
{
	System.out.println("Woooof");
}
}
