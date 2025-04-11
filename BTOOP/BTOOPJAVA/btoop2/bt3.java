package btoop2;

public class bt3 {

	public static void main(String[] args) {
		Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
	      System.out.println(a1.tostring());

	      a1.setEmail("ahteck@somewhere.com");
	      System.out.println(a1.tostring());
	      System.out.println("name is: " + a1.getName());
	      System.out.println("email is: " + a1.getEmail());

	      // Test Book class
	      Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
	      System.out.println(b1.tostring1());
	      b1.setPrice(9.9);
	      b1.setQty(99);
	      System.out.println(b1.tostring1());
	      System.out.println("isbn is: " + b1.getIsbn());
	      System.out.println("name is: " + b1.getName());
	      System.out.println("price is: " + b1.getPrice());
	      System.out.println("qty is: " + b1.getQty());
	      System.out.println("author is: " + b1.getAuthor().tostring());
	      System.out.println("author is name: " + b1.getAuthorName1());
	      System.out.println("author's name: " + b1.getAuthor().getName());
	      System.out.println("author's email: " + b1.getAuthor().getEmail());
	   }
	}
