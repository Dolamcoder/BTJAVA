package btoop3;

public class MyComplex {
	private double real;
	private double imag;
	public MyComplex() {
		this(0.0, 0.0);
	}
	public MyComplex(double real, double imag) {
		this.real=real;
		this.imag=imag;
	}
	public void setReal(double real) {
		this.real=real;
	}
	public double getReal()
	{
		return this.real;
	}
	public void setImag(double imag) {
		this.imag=imag;
	}
	public double getImag() {
		return this.imag;
	}
	public void setValue(double real, double imag) {
		this.real=real;
		this.imag=imag;
	}
	public String tostring()
	{
		return "("+this.real+"+"+this.imag+"i"+")";
	}
	public boolean isReal()
	{
		if (this.imag==0) return true;
		return false;
	}
	public boolean isImag()
	{
		if (this.real==0) return true;
		return false;
	}
	public boolean equals(double real, double imag) {
		if (this.real==real && this.imag==imag) return true;
		return false;
	}
	public double magnitude() {
		return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imag, 2));
	}
	public boolean equals(MyComplex another)
	{
		if (this.real == another.real && this.imag == another.imag) return true;
		return false;
	}

}
