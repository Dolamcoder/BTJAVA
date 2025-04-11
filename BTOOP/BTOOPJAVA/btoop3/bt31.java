package btoop3;

import java.util.Scanner;

import baitap3.MyComplex;

public class bt31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x1, y1, x2, y2;
		System.out.print("nhap so phuc 1 (phan thuc va phan ao): ");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		System.out.print("nhap so phuc 2 (phan thuc va phan ao): ");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		MyComplex a=new MyComplex();
		MyComplex a1=new MyComplex(x1, y1);
		MyComplex a2=new MyComplex(x2, y2);
		System.out.print("so phuc 1 la: ");
		System.out.println(a1.tostring());
		System.out.print("so phuc 2 la: ");
		System.out.println(a2.tostring());
		if(a1.isReal()) System.out.println(a1.tostring()+" la so thuan thuc");
		else System.out.println(a1.tostring()+" khong la so thuan thuc");
		if (a1.isImag()) System.out.println(a1.tostring()+" la so thuan ao");
		else System.out.println(a1.tostring()+" khong la so thuan ao");
		if(a2.isReal()) System.out.println(a2.tostring()+" la so thuan thuc");
		else System.out.println(a2.tostring()+" khong la so thuan thuc");
		if (a2.isImag()) System.out.println(a2.tostring()+" la so thuan ao");
		else System.out.println(a2.tostring()+" khong la so thuan ao");
		if (a1.equals(a2.getReal(), a2.getImag())) System.out.println(a1.tostring()+"bang"+a2.tostring());
		else System.out.println(a1.tostring()+" khong bang "+a2.tostring());
		System.out.println("do lon "+a1.tostring()+"="+a1.magnitude());
		System.out.println("do lon "+a2.tostring()+"="+a2.magnitude());
	}

}
