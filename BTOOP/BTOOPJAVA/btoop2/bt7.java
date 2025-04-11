package btoop2;

public class bt7 {
	public static void main(String[] args) {
MyLine ml1=new MyLine(2, 3, 4, 5);
MyPoint begin=new MyPoint(1,1);
MyPoint end=new MyPoint(3, 3);
MyLine ml2=new MyLine(begin, end);
System.out.println(ml1.getLength());
System.out.println(ml1.getGradient());
System.out.println(ml1.tostring());
System.out.println(ml2.tostring());
	}
}
