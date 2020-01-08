package rectangle;

public class Rectangle 
{
	//constructor: ham khoi tao ko doi so
	//gan gia tri mac dinh ban dau cho thuoc tinh cua class
	public   Rectangle () {
		
	}
	
	//constructor: ham khoi tao co doi so
	// truyen tham so ngoai vao cho thuoc tinh cua class
	public   Rectangle(double l, double w) {
		setLength(l);
		setWidth(w);
	}
	//khai bao thuoc tinh
	private double length, width;
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public void setLength(double l ) {
		if(l<0) length =0;
		else 
			length =l;
	}
	public void setWidth(double w ) {
		if(w<0) width =0;
		else 
			width =w;
	}
	//cai dat ca phuong thuc
	public double area()
	{
		return length * width;
	}
	
	public double perimeter()
	{
		return (length + width)*2;
	}
	
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle ();
//		r1.setLength (-2);
//		r1.setWidth((8));
		r1.length = 2;
		r1.width = 8;
		System.out.println( r1.area() );
		System.out.println( r1.perimeter() );
		
		Rectangle r2 = new Rectangle (2,8);
		System.out.println( r2.area() );
		System.out.println( r2.perimeter() ); 
		
		}

}
