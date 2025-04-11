package btoop2;

public class bt8 {

	public static void main(String[] args) {
	MyPoint a=new MyPoint(2, 3);
	MyCircle my1=new MyCircle(a, 2);
	MyCircle my2=new MyCircle(1,1,3);
	System.out.println(my1.getCenter().tostring());
	System.out.println(my1.tostring());
	System.out.println(my1.distance(my2));
	System.out.println(my1.getArea());
	System.out.println(my2.getCenter().tostring());
	System.out.println(my2.tostring());
	System.out.println(my2.getCircumference());
	}

}
