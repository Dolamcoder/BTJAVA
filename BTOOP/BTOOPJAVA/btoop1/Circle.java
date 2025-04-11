package baitap00p1;

public class Circle {
private double radius;
private String color;
public Circle()
{
	this.radius=1.0;
	this.color="red";
}
public Circle(double r)
{
	this.radius=r;
}
public void setRadius(double radius)
{
	this.radius=radius;
}
public double getRadius()
{
	return this.radius;
}
public double getArea()
{
	return radius*radius*Math.PI;
}
public double getCircumference() {
	return 2*Math.PI*radius;
}
public String tostring()
{
	return "Circle[radius="+this.radius+"]";
}
}
