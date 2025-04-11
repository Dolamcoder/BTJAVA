package btoop2;
public class MyPoint {
private int x, y;
public MyPoint()
{
	this.x=1;
	this.y=2;
}

public MyPoint(int x, int y)
{
	this.x=x;
	this.y=y;
}
public int getX()
{
	return x;
}
public int getY()
{
	return y;
}
public void setX(int x)
{
	this.x=x;
}
public void setY(int y)
{
	this.y=y;
}
public void setXy(int x, int y)
{
	this.x=x;
	this.y=y;
}
public String tostring()
{
	return "("+this.x+","+this.y+")";
}
public double distance(int x, int y)
{
	return Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));
}
public double distance(MyPoint another) {
	double a=Math.pow(this.x-another.x, 2);
    double b=Math.pow(this.y-another.y,2);
    return Math.sqrt(a+b);
}
public double distance()
{
	return Math.sqrt(this.x*this.x+this.y*this.y);
}
}