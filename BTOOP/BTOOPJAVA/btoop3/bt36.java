package btoop3;
public class bt36 {
	public static void main(String[] args) {
		        Ball ball = new Ball(0, 0,5, 10, 45);
		        System.out.println("Initial State: " + ball.tostring());
		        ball.move();
		        System.out.println("After Move: " + ball.tostring());
		        ball.setX(5);
		        ball.setY(5);
		        ball.setXDelta(3);
		        ball.setYDelta(4);
		        System.out.println("After Setting New Position and Speed: " + ball.tostring());
		        ball.reflectHorizontal();
		        System.out.println("After Horizontal Reflection: " + ball.tostring());
		        ball.reflectVertical();
		        System.out.println("After Vertical Reflection: " + ball.tostring());
		        ball.move();
		        System.out.println("After Another Move: " + ball.tostring());
		        Container container = new Container(0, 0, 10, 10); 
		        System.out.println("Container State: " + container.tostring());
		        Ball ball2 = new Ball(5, 5,5, 5, 45); 
		        System.out.println("Initial Ball State: " + ball.tostring());
		        ball.move();
		        System.out.println("After Move: " + ball.tostring());
		        container.collides(ball);
		        System.out.println("Collision Detected: " +   container.collides(ball));
		        System.out.println("Ball State After Collision Check: " + ball.tostring());
		        ball.setX(12); // Move outside the right boundary
		        System.out.println("Ball State After Moving Outside: " + ball.tostring());
		        System.out.println("Collision Detected: " +  container.collides(ball));
		        System.out.println("Ball State After Second Collision Check: " + ball.tostring());
	}
}
