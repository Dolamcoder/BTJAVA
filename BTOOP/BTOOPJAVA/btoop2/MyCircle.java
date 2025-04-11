package btoop2;

public class MyCircle {
private MyPoint center;
private int radius;
public MyCircle()
{
	this.center=new MyPoint(0, 0);
	this.radius=1;
}
public MyCircle(int x, int y, int radius)
{
	this.center=new MyPoint(x, y);
	this.radius=radius;
}
public MyCircle(MyPoint center, int radius)
{
	this.center =center;
	this.radius=radius;
}
public int getRadius()
{
	return this.radius;
}
public void setRadius(int x)
{
	this.radius=x;
}
public MyPoint getCenter()
{
	return this.center;
}
public void setCenter(MyPoint a)
{
	this.center=a;
}
public int getCenterX()
{
	return center.getX();
}
public void setCenterX(int x)
{
	this.center.setX(x);
}
public int getCenterY()
{
	return center.getY();
}
public void setCenterY(int y)
{
	this.center.setY(y);
}
public void setCenterXY(int x, int y)
{
	this.center.setX(x);
	this.center.setY(y);
}
public String tostring()
{
	return "MyCircle[radius="+this.radius+",center="+center.tostring()+"]";
}
public double getArea()
{
	return 3.14*Math.pow(this.radius, 2);
}
public double getCircumference()
{
	return 2*this.radius*3.14;
}
public double distance(MyCircle another)
{
	double a=Math.pow(center.getX()-another.getCenterX(),2 );
	double b=Math.pow(center.getY()-another.getCenterY(),2 );
    return Math.sqrt(a+b);
}
}
