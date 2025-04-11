package btoop6;

public class Rectangle2 implements GeometricObject {
private double width;
private double length;
public Rectangle2(double width, double length) {
	this.width = width;
	this.length = length;
}
public double getArea()
{
	return this.width*this.length;
}
public double getPerimeter()
{
	return 2*(this.length+this.width);
}
@Override
public String toString() {
	return "Rectangle2 [width=" + this.width + ", length=" + this.length + "]";
}

}
