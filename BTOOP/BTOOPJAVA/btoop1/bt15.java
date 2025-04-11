package baitap00p1;

public class bt15 {

	public static void main(String[] args) {
		InvoiceItem inv1 = new InvoiceItem("A101", "Bút đỏ", 888, 0.08);
		System.out.println(inv1.tostring());
	      inv1.setQty(999);
	      inv1.setunitprice(0.99);
	      System.out.println(inv1.tostring());
	      System.out.println("id là: " + inv1.getId());
	      System.out.println("desc là: " + inv1.getDesc());
	      System.out.println("số lượng là: " + inv1.getQty());
	      System.out.println("unitPrice là: " + inv1.getunitPrice());
	      System.out.println("Tổng số là: " + inv1.getTotal());

	}

}
