package btoop6;

public class bt65 {

	public static void main(String[] args) {
		GeometricObject circle=new Circle2(5);
		Circle2 circle1 = (Circle2)circle; 
		System.out.println(circle1);
		System.out.println("Area: "+circle.getArea());
		System.out.println("Perimeter: "+circle.getPerimeter());
		//tai su dung
        Resizable r=new ResizableCircle(3);
        System.out.println(r);
        r.resize(50);
        System.out.println(r);
        
	}

}
