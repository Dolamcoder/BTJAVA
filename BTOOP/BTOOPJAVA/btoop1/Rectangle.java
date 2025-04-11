package baitap00p1;

public class Rectangle {
private float length;
private float width;
public Rectangle() {
	this.length=1.0f;
	this.width=1.0f;
}
public Rectangle(float a, float b) {
	this.length=a;
	this.width=b;
}
public void setLength(float length)
{
	this.length=length;
}
public float getLength()
{
	return this.length;
}
public void setWidth(float width)
{
	this.width=length;
}
public float getWidth()
{
	return this.width;
}
public double getArea()
{
	return this.length*this.width;
}
public double getPerimeter()
{
	return 2*(this.length+this.width);
}
public String tostring() 
{	
	return "Rectangle[length="+this.length+",width="+this.width+"]";
}
}
