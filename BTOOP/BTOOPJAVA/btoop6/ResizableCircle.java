package btoop6;
public class ResizableCircle extends Circle2 implements Resizable{
	public void resize(int percent) {
		radius*=percent/100;
	}
	public ResizableCircle(double radius)
	{
		super(radius);
	}
   public String toString()
   {
	   return "ResizableCircle["+super.toString()+"]";
   }
   
}