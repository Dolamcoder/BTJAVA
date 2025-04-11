package btoop3;

import baitap3.MyTime;

public class bt34 {

	public static void main(String[] args) {
		MyTime t1 = new MyTime(1, 2, 3); 
	      System.out.println(t1.tostring());   // toString() // Kiểm tra các hàm thiết lập và lấy 
	      t1.setHour(4); 
	      t1.setMinute(5); 
	      t1.setSecond(6); 
	      System.out.println(t1.tostring());   // toString() 
	      System.out.println("Giờ: " + t1.getHour()); 
	      System.out.println("Phút: " + t1.getMinute()); 
	      System.out.println("Giây: " + t1.getSecond()); // Kiểm tra setTime() 
	      t1.setTime(23, 59, 58); 
	      System.out.println(t1.tostring());   // toString() // Kiểm tra nextSecond(); 
	      System.out.println(t1.nextSecond().tostring()); 
	      System.out.println(t1.nextSecond().nextSecond().tostring()); // Kiểm tra previousSecond() 
	      System.out.println(t1.previousSecond().tostring()); 
	      System.out.println(t1.previousSecond().previousSecond().tostring()); 

	}

}
