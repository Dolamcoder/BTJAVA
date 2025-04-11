package btoop4;
public class bt5 {
	public static void main(String[] agrs) {
		System.out.println("Circle:");
        Circle2 circle3 = new Circle2(3.0, "green", true);
        System.out.println("Circle 3: " + circle3);
        System.out.println("Area: " + circle3.getArea());
        System.out.println("Perimeter: " + circle3.getPerimeter());
        System.out.println("Rectangle:");
        Rectangle rectangle3 = new Rectangle(4.0, 5.0, "blue", true);
        System.out.println("Rectangle 3: " + rectangle3);
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());
        System.out.println("Square:");
        Square square3 = new Square(4.0, "red", true);
        System.out.println("Square 3: " + square3);
        System.out.println("Area: " + square3.getArea());
        System.out.println("Perimeter: " + square3.getPerimeter());
}
}
