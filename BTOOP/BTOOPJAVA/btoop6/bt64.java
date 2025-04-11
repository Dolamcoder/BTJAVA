package btoop6;

public class bt64 {

	public static void main(String[] args) {
			Movable point = new MovablePoint(0, 0, 5, 3);
			System.out.println("Test lop MovablePoint: ");
	        System.out.println("Initial position: " + point);
	        point.moveUp();
	        System.out.println("After moving up: " + point);
	        point.moveDown();
	        System.out.println("After moving down: " + point);
	        point.moveLeft();
	        System.out.println("After moving left: " + point);
	        point.moveRight();
	        System.out.println("After moving right: " + point);
	        System.out.println("Test lop movableCircle: ");
	        Movable circle = new MovableCircle(0, 0, 5, 3, 10);
	        System.out.println("Initial state: " + circle);
	        circle.moveUp();
	        System.out.println("After moving up: " + circle);
	        circle.moveDown();
	        System.out.println("After moving down: " + circle);
	        circle.moveLeft();
	        System.out.println("After moving left: " + circle);
	        circle.moveRight();
	        System.out.println("After moving right: " + circle);

	}

}
