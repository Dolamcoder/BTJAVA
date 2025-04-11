package btoop4;

public class bt44 {
    public static void main(String[] args) {
        // Tạo một đối tượng MovablePoint với tọa độ và tốc độ
        MovablePoint point = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        
        // In ra thông tin ban đầu
        System.out.println("Initial Point: " + point);
        
        // Kiểm tra các phương thức get
        System.out.println("X Speed: " + point.getXSpeed());
        System.out.println("Y Speed: " + point.getYSpeed());

        // Thay đổi tốc độ
        point.setXSpeed(1.0f);
        point.setYSpeed(1.0f);
        System.out.println("Updated Speed: " + point.getSpeed()[0] + ", " + point.getSpeed()[1]);

        // Di chuyển điểm
        point.move();
        System.out.println("Point after moving: " + point);
        
        // Thay đổi tốc độ và di chuyển một lần nữa
        point.setSpeed(2.0f, 3.0f);
        point.move();
        System.out.println("Point after moving again: " + point.toString());
    }
}
