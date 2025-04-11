package btoop2;
import java.util.Scanner;
import test.MyTriangle;
public class bt9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x1, y1, x2, y2, x3, y3;
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		x3=sc.nextInt();
		y3=sc.nextInt();
MyTriangle a=new MyTriangle(x1, y1, x2, y2, x3, y3);
System.out.println(a.toString());
System.out.println(a.getPerimeter());
System.out.println(a.gettype());
	}
}
