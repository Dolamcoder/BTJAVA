package baitap00p1;

public class bt12 {

	public static void main(String[] args) {
		Circle c=new Circle();
		Circle c1=new Circle();
		Circle c2=new Circle(2.2);
		c1.setRadius(1.3);
		System.out.println(c.tostring());
		System.out.println(c1.tostring());
		System.out.println(c2.tostring());
		System.out.println("radius: "+c2.getRadius());
		System.out.println("Area: "+c2.getArea());
		System.out.println("chu vi: "+c2.getCircumference());
	}

}
