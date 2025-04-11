package btoop6;

public class Circle2 implements GeometricObject {
protected double radius;
public Circle2(double radius) {
	this.radius = radius;
}
public double getRadius()
{
	return this.radius;
}
public double getArea()
{
	return this.radius*this.radius*Math.PI;
}
public double getPerimeter()
{
	return this.radius*Math.PI*2;
}
@Override
public String toString() {
	return "Circle2 [radius=" + this.radius + "]";
}

}
