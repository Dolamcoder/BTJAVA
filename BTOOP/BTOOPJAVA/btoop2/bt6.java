package btoop2;
import java.util.Random;
public class bt6 {
public static void main(String[] args)
{
	Random rd=new Random();
MyPoint[] point=new MyPoint[10];
for(int i=0;i<point.length;i++)
{
	point[i]=new MyPoint(rd.nextInt(10), rd.nextInt(10));
}
for(int i=0;i<point.length;i++)
{
System.out.print(point[i].tostring()+" ");
}
System.out.println();
System.out.println("do dai cua diem thu 0 va diem thu 1 la:"+point[0].distance(point[1]));
System.out.println("do dai cua diem thu 7 la:"+point[7].distance());
}
}
