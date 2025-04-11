package btoop2;

public class bt1 {
public static void main(String[] args) {
	Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
	System.out.println(ahTeck.tostring());  
	Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);   // Hàm tạo của Test Book 
	System.out.println(dummyBook.tostring1());   // toString() của Test Book
	dummyBook.setPrice(29.95);
	dummyBook.setQty(28);
	System.out.println("tên là: " + dummyBook.getName());
	System.out.println("giá là: " + dummyBook.getPrice());
	System.out.println("số lượng là: " + dummyBook.getQty());
	System.out.println("Tác giả là: " + dummyBook.getAuthor());   // toString() của tác giả
	System.out.println("Tên tác giả là: " + dummyBook.getAuthor().getName());
	System.out.println("Email của tác giả là: " + dummyBook.getAuthor().getEmail());
	Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.55, 6);
	System.out.println(anotherBook.tostring1());  
}
}
