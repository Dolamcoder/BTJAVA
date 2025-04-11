package btoop6;
public class bt62 {
	public static void main(String[] args) {
		System.out.println("HINH TRON: ");
		GeometricObject circle=new Circle2(5.0);
		System.out.println(circle);
		System.out.println("Area: "+circle.getArea());
		System.out.println("Perimeter: "+circle.getPerimeter());
		System.out.println("HINH CHU NHAT: ");
		GeometricObject rectangle=new Rectangle2(3.0, 4.0);
		System.out.println(rectangle);
		System.out.println("Area: "+rectangle.getArea());
		System.out.println("Perimeter: "+rectangle.getPerimeter());
	}

}
