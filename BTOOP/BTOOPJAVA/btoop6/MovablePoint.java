package btoop6;
public class MovablePoint implements Movable{
int x;
int y;
int xSpeed;
int ySpeed;
public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
	this.x = x;
	this.y = y;
	this.xSpeed = xSpeed;
	this.ySpeed = ySpeed;
}
@Override
public String toString() {
	return "("+this.x+","+this.y+") speed=("+this.xSpeed+","+this.ySpeed+")"; 
}
public void moveUp()
{
	this.y-=this.ySpeed;
}
public void moveDown()
{
	this.y+=ySpeed;
}
public void moveLeft()
{
	this.x-=this.xSpeed;
}
public void moveRight()
{
	this.x+=this.xSpeed;
}
}
