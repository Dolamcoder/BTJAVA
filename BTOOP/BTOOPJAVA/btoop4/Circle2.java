package btoop4;

public class Circle2 extends Shape {
  private double radius;
  public Circle2()
  {
	  this.radius=1.0;
  }
  public Circle2(double radius)
  {
	  this.radius=radius;
  }
  public Circle2(double radius, String color, boolean filled)
  {
	  super(color, filled);
	  this.radius=radius;
  }
  public double getRadius()
  {
	  return this.radius;
  }
  public void setRadius(double r)
  {
	  this.radius=r;
  }
  public double getArea()
  {
	  return Math.PI*this.radius*this.radius;
  }
  public double getPerimeter()
  {
	  return this.radius*2*Math.PI;
  }
  public String toString()
  {
	  return "Circle["+super.toString()+",radius="+this.radius+"]";
  }
}
