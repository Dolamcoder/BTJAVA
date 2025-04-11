package btoop2;

import test.MyPoint;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		v1=new MyPoint(x1 , x2);
		v2=new MyPoint(x2, y2);
		v3=new MyPoint(x3, y3);
	}
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1=v1;
		this.v2=v2;
		this.v3= v3;
	}
	public String toString()
	{
		return "MyTriangle[v1=("+v1.setX()+","+v1.setX()+"),v2=("+v2.setX()+","+v2.setY()+"),v3=("+v3.setX()+","+v3.setY()+")]";
	}
	public double dodai1()
	{
	    double t=Math.pow(v1.setX()-v2.setX(),2);
	    double u=Math.pow(v1.setY()-v2.setY(),2);
	    return Math.sqrt(t+u);
	}
	public double dodai2()
	{
	    double t=Math.pow(v1.setX()-v3.setX(),2);
	    double u=Math.pow(v1.setY()-v3.setY(),2);
	    return Math.sqrt(t+u);
	}
	public double dodai3()
	{
	    double t=Math.pow(v2.setX()-v3.setX(),2);
	    double u=Math.pow(v2.setY()-v3.setY(),2);
	    return Math.sqrt(t+u);
	}
	public double  getPerimeter()
	{
		return dodai1()+dodai2()+dodai3();
	}
	public String gettype() {
		double a=dodai1();
		double b=dodai2();
		double c=dodai3();
		if(a==b && b==c && a==c)
		return "Equilateral";
		else if (a!=b && b!=c && a!=c) return "Scalene";
		return "Isosceles";
}
}
