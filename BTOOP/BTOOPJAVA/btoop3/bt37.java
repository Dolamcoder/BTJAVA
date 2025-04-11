package btoop3;

public class bt37 {
	public static void main(String[] args) {
		Ball ball=new Ball(1, 2, 3);
		System.out.println("toa do cua qua bong: ");
		System.out.println(ball);
		Player player=new Player(7, 1, 3);
		System.out.println("co da trung bong hay khong????");
		System.out.println(player.near(ball));
	}

}
