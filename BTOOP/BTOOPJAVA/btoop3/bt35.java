package btoop3;

public class bt35 {
public static void main(String[] args)
{
	MyDate md=new MyDate(2012, 2, 28);
	System.out.println("test one:");
	System.out.println(md.tostring());
	md.nextDay();
	System.out.println(md.tostring());
	md.nextDay();
	System.out.println(md.tostring());
	md.nextMonth();
	System.out.println(md.tostring());
	md.nextYear();
	System.out.println(md.tostring());
	System.out.println(md.previousDay().tostring());
	System.out.println("tesst two:");
	MyDate d2 = new MyDate(2012, 1, 2);
	System.out.println(d2.tostring());                 // Monday 2 Jan 2012
	System.out.println(d2.previousDay().tostring());
}
}
