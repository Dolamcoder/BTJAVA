package btoop3;
public class bt32 {
	public static void main(String[] args) {
		double[] a= {1, 2, 3, 4, 5};
		MyPolynomial my=new MyPolynomial(a);
		System.out.println(my.tostring());
		System.out.println(my.evaluate(4, a));
		double[] b= {1, 4,6,8,12,5};
		MyPolynomial my1=new MyPolynomial(b);
		System.out.println(my1.tostring());
		MyPolynomial my2=my.add(my1);
		System.out.println(my2.evaluate(4));
		my.multiply(my1);
		MyPolynomial my3=my.multiply(my1);
		System.out.println(my3.evaluate(4));
	}

}
