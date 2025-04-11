package btoop3;
public class MyPolynomial {
	private double[] coeffs;
	public MyPolynomial(double[] coeffs)
	{
		this.coeffs=coeffs;
	}
	public int getDegree()
	{
		return coeffs.length-1;
	}
	public double evaluate(double x) {
	    double sum = 0;
	    for (int i = 0; i < coeffs.length; i++) {
	        sum += coeffs[i] * Math.pow(x, i);
	    }
	    return sum;
	}
	public String tostring()
	{
		int size=coeffs.length-1;
		String s="";
		for (int i=size;i>=0;i--)
		{
			if (size==0) {
				s+=coeffs[size];
			}
			else {
			s+=coeffs[size]+"x"+"^"+size+""+"+";
			}
			size--;
		}
		return s;
	}
	public double evaluate(double x, double[] coeffs) {
		double result=coeffs[coeffs.length-1];
		for (int i=coeffs.length-2;i>=0;i--)
		{
			result=result*x+coeffs[i];
		}
		return result;
	}
	public MyPolynomial add(MyPolynomial right)
	{
	   int min=Math.min(this.coeffs.length, right.coeffs.length);
	   int max=Math.max(this.coeffs.length, right.coeffs.length);
	   double[] newcoeffs=new double[max];
	   for(int i=0;i<min;i++)
	   {
		   newcoeffs[i]=this.coeffs[i]+right.coeffs[i];
		   if(this.coeffs.length>min)
		   {
			   for(int j=min;i<coeffs.length;j++)
			   {
				   newcoeffs[j]=coeffs[j];
			   }
		   }
		   else
		   {
			   for(int k=min;k<right.coeffs.length;k++)
			   {
				   newcoeffs[k]=right.coeffs[k];
			   }
		   }
	   }
	   return new MyPolynomial(newcoeffs);
	}
	public MyPolynomial multiply(MyPolynomial right)
	{
		int newLength = this.coeffs.length + right.coeffs.length - 1;
	    double[] newCoeffs = new double[newLength];

	    for (int i = 0; i < this.coeffs.length; i++) {
	        for (int j = 0; j < right.coeffs.length; j++) {
	            newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
	        }
	    }
	    return new MyPolynomial(newCoeffs);
	}
}
