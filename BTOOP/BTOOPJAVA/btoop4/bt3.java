package btoop4;

public class bt3 {
	public static void main(String[] args) {       
//		Point2D point1 = new Point2D();
//	        System.out.println("Point1: " + point1);
//	    Point2D point2 = new Point2D(3.0f, 4.0f);
//	        System.out.println("Point2: " + point2);
//	        System.out.println("X của Point2: " + point2.getX());
//	        System.out.println("Y của Point2: " + point2.getY());
//	        point2.setX(5.0f);
//	        point2.setY(6.0f);
//	        System.out.println("Point2 sau khi thay đổi: " + point2);
//	        point2.setXY(7.0f, 8.0f);
//	        System.out.println("Point2 sau khi setXY: " + point2);
//	        float[] coordinates = point2.getXY();
//	        System.out.println("Toạ độ Point2: (" + coordinates[0] + "," + coordinates[1] + ")");
	                Point3D point1 = new Point3D();
	                System.out.println("Point1: " + point1.toString());
	                Point3D point2 = new Point3D(1.0f, 2.0f, 3.0f);
	                System.out.println("Point2: " + point2.toString());
	                System.out.println("X của Point2: " + point2.getX());
	                System.out.println("Y của Point2: " + point2.getY()); 
	                System.out.println("Z của Point2: " + point2.getZ());
	                point2.setZ(4.0f);
	                System.out.println("Point2 sau khi thay đổi Z: " + point2); 
	                point2.setXYZ(5.0f, 6.0f, 7.0f);
	                System.out.println("Point2 sau khi setXYZ: " + point2); 
	                float[] coordinates = point2.getXYZ();
	                System.out.println("Tọa độ của Point2: (" + coordinates[0] + "," + coordinates[1] + "," + coordinates[2] + ")"); 
	                System.out.println("Chuỗi của Point2: " + point2.toString());

	    }
	}
