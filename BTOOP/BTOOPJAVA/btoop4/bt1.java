package btoop4;

public class bt1 {
public static void main(String[] args) {
	Circle c=new Circle(2, "red");
	Cylinder cy=new Cylinder(3, 4, "red");
	System.out.println(c);
	System.out.println(c.getArea());
	System.out.println(cy);
	System.out.println(cy.getArea());
	System.out.println(cy.getVolume());
}
}
