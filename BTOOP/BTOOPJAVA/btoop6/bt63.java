package btoop6;
public class bt63 {
public static void main(String[] args) {
	Movable m=new MovablePoint(2,2,1,1);
    System.out.println(m);
    m.moveUp();
    System.out.println("di len: "+m);
    m.moveDown();
    System.out.println("di xuong: "+m);
    m.moveLeft();
    System.out.println("di sang trai: "+m);
    m.moveRight();
    System.out.println("di sang phai: "+m);    
}
}
