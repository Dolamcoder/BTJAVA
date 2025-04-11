package btoop3;

public class Container {
private int x1, x2, y1, y2;
public Container(int x, int y, int width, int height)
{
	this.x1=x;
	this.y1=y;
	this.x2=x+width-1;
	this.y2=y+height-1;
}
public int getX()
{
	return this.x1;
}
public int getY()
{
	return this.y1;
}
public int getWidth()
{
	return this.x2-this.x1+1;
}
public int getHeight()
{
	return this.y2-this.y1+1;
}
public boolean collides(Ball ball)
{
	float ballx=ball.getX()-ball.getRadius();
	if(ballx<=this.x1 || ballx>=this.x2)
		ball.reflectHorizontal();
	return true;
}
public String tostring()
{
	return "Container[("+this.x1+","+this.y1+"),("+this.x2+","+this.y2+")]";
}
}

