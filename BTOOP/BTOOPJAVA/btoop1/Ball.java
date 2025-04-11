package baitap00p1;

public class Ball {
private float x, y, xDelta, yDelta;
private int radius;
public Ball(float x, float y, int radius, float xDelta, float yDelta) {
	this.x=x;
	this.y=y;
	this.radius=radius;
	this.xDelta=xDelta;
	this.yDelta=yDelta;
}
public void setX(float x)
{
	this.x=x;
}
public float getX()
{
	return this.x;
}
public void setY(float y)
{
	this.y=y;
}
public float getY()
{
	return this.y;
}
public void setxDelta(float xdelta)
{
	this.xDelta=xdelta;
}
public float getxDelta()
{
	return this.xDelta;
}
public void setyDelta(float ydelta)
{
	this.yDelta=ydelta;
}
public float getyDelta()
{
	return this.yDelta;
}
public void setRadius(int r)
{
	this.radius=r;
}
public int getRadius()
{
	return this.radius;
}
public void move()
{
	this.x+=this.xDelta;
	this.y+=this.yDelta;
}
public void reflectHorizontal()
{
	this.xDelta*=-1;
}
public void reflectVertical()
{
	this.yDelta*=-1;
}
public String tostring()
{
	return "Ball[("+this.x+","+this.y+")"+",speed=("+this.xDelta+","+this.yDelta+")]";
}
}