package baitap00p1;

public class bt13 {
	public static void main(String[] args) {
		Rectangle rc1=new Rectangle();
		Rectangle rc2=new Rectangle(1.2f, 3.4f);
		Rectangle rc3=new Rectangle();
		rc3.setLength(10.2f);
		rc3.setWidth(5.6f);
		System.out.println(rc1.tostring());
		System.out.println(rc2.tostring());
		System.out.println(rc3.tostring());
		System.out.println("Length: "+rc3.getLength());
		System.out.println("Width: "+rc3.getWidth());
		System.out.println("Area: "+rc3.getArea());
		System.out.println("Perimeter: "+rc3.getPerimeter());
	}

}
