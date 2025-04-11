package btoop3;

public class Ball {
	    private float x;
	    private float y;
	    private int radius;
	    private float xDelta;
	    private float yDelta;
	    float z;
	    public Ball(float x, float y, int radius, int speed, int direction) {
	        this.x = x;
	        this.y = y;
	        this.radius = radius;
	        this.xDelta=(float) (speed*Math.cos(direction*Math.PI/180));
	    }
        public Ball(float x, float y, float z) {
        	this.x=x;
        	this.y=y;
        	this.z=z;
        }
        public float getZ()
        {
        	return this.z;
        }
        public void setXYZ(float x, float y, float z)
        {
        	this.x=x;
        	this.y=y;
        	this.z=z;
        }
        
	    public float getX() {
	        return this.x;
	    }

	    public void setX(float x) {
	        this.x = x;
	    }

	    public float getY() {
	        return this.y;
	    }

	    public void setY(float y) {
	        this.y = y;
	    }

	    public int getRadius() {
	        return this.radius;
	    }

	    public void setRadius(int radius) {
	        this.radius = radius;
	    }

	    public float getXDelta() {
	        return this.xDelta;
	    }

	    public void setXDelta(float xDelta) {
	        this.xDelta = xDelta;
	    }

	    public float getYDelta() {
	        return this.yDelta;
	    }

	    public void setYDelta(float yDelta) {
	        this.yDelta = yDelta;
	    }

	    public void move() {
	        this.x += xDelta;
	        this.y += yDelta;
	    }

	    public void reflectHorizontal() {
	        this.xDelta *=-1;
	    }

	    public void reflectVertical() {
	        yDelta *=-1;
	    }
        public String tostring()
        {
        	return "Ball[("+this.x+","+this.y+"),speed=(xDelta="+this.xDelta+","+this.yDelta+")]";
	    }
        public String toString()
        {
        	return "("+this.x+","+this.y+","+this.z+")";
        }
	}
