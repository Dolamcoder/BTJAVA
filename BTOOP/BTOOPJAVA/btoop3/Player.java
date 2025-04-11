package btoop3;

public class Player {
	private int number;
	  private float x;
	  private float y;
	  private float z = 0.0f;

	  public Player(int number, float x, float y) {
	    this.number = number;
	    this.x = x;
	    this.y = y;
	  }

	  public void move(float xDisp, float yDisp) {
	    this.x += xDisp;
	    this.y += yDisp;
	  }

	  public void jump(float zDisp) {
	    this.z += zDisp;
	  }

	  public boolean near(Ball ball) {
	    double a=Math.pow(this.x-ball.getX(), 2);
	    double b=Math.pow(this.y-ball.getY(), 2);
	    double c=Math.pow(this.z-ball.getZ(), 2);
	    if(Math.sqrt(a+b+c)<8) return true;
	    return false;
	  }

	  public void kick(Ball ball) {
	    
	  }
}
