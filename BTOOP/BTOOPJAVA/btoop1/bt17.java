package baitap00p1;

public class bt17 {

	public static void main(String[] args) {
		Date d1 = new Date(1, 2, 2014); 
	      System.out.println(d1.tostring());   // toString() // Kiểm tra các Setter và Getter 
	      d1.setMonth(12); 
	      d1.setDay(9); 
	      d1.setYears(2099); 
	      System.out.println(d1.tostring());   // toString() 
	      System.out.println("Tháng: " + d1.getMonth()); 
	      System.out.println("Ngày: " + d1.getDay()); 
	      System.out.println("Năm: " + d1.getYears()); // Kiểm tra setDate() 
	      d1.setDate(3, 4, 2016); 
	      System.out.println(d1.tostring());   // toString() 

	}

}
