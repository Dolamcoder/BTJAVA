package btoop2;

public class bt2 {

	public static void main(String[] args) {
    Author author1=new Author("lam", "lambatdiet@gmail.com",'n');
    Author author2=new Author("A","nguyenvana@gmail.com",'n');
    Author[] a=new Author[2];
    a[0]=author1;
    a[1]=author2;
    Book book=new Book("java", a, 132, 5);
    System.out.println(book.tostring());

	}

}
