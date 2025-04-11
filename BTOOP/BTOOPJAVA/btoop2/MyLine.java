package btoop2;

public class MyLine {
private MyPoint begin;
private MyPoint end;
public MyLine(int x1, int y1, int x2, int y2)
{
	begin=new MyPoint(x1, y1);
	end=new MyPoint(x2, y2);
}
public MyLine(MyPoint begin, MyPoint end)
{
	this.begin=begin;
	this.end=end;
}
public MyPoint getBegin()
{
	return this.begin;
}
public void setBegin(MyPoint begin)
{
	this.begin=begin;
}
public MyPoint getEnd()
{
	return this.end;
}
public void setEnd(MyPoint end)
{
	this.end=end;
}
public int getBeginX()
{
	return this.begin.getX();
}
public void setBeginX(int x)
{
	this.begin.setX(x);
}
public int getBeginY()
{
	return this.begin.getY();
}
public void setBeginY(int y)
{
	this.begin.setX(y);
}
public int getEndX()
{
	return this.end.getX();
}
public void setEndX(int x)
{
	this.end.setX(x);
}
public int getEndY()
{
	return this.end.getY();
}
public void setEnd(int y)
{
	this.end.setX(y);
}
public void setBeginXY(int x, int y)
{
	this.begin.setX(x);
	this.begin.setY(y);
}
public void setEndXY(int x, int y)
{
	this.end.setX(x);
	this.end.setY(y);
}
public double getLength()
{
	return begin.distance();
}
public double getGradient()
{
	return Math.atan2(begin.getX(), begin.getY());
}
public String tostring()
{
	return "MyLine[begin="+this.begin.tostring()+",end="+this.end.tostring()+"]";
}
}