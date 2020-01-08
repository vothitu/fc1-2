package triangle;

public class Triangle 
{	
	private double a, b, c;
	//constructor: ham khoi tao ko doi so
	//gan gia tri mac dinh ban dau cho thuoc tinh cua class
	public   Triangle() {
		
	}
	//constructor: ham khoi tao co doi so
	// truyen tham so ngoai vao cho thuoc tinh cua class
	public Triangle(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}
	//khai bao thuoc tinh
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public void setA(double t ) {
		if(t<0) a =0;
		else 
			a =t;
	}
	public void setB(double h ) {
		if(h<0) b =0;
		else 
			b =h;
	}
	public void setC(double l ) {
		if(l<0) c =0;
		else 
			c =l;
	}
	//cai dat ca phuong thuc
	public Double area()
	{
		if(a+b>c && b+c>a && a+c>b) 
		{
			double p=(a+b+c)/2;
			return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		}
		else
		{
			System.out.println("it is not triangle ");
			 return null;
		}
	}
	public Double perimeter()
	{
		if(a+b>c && a+c>b && b+c>a)
		{
			return a+b+c;
		}
		else 
		{
			System.out.println("it is not Triangle ");
			return null;
		}
	}

	public static void main(String[] args) 
	{
		//tao cac doi tuong co gia tri cu the rieng biet
		Triangle t1 = new Triangle ();
//		t1.setA(4);
//		t1.setB(5);
//		t1.setC(3);
//		t1.a=4;
//		t1.b=5;
//		t1.c=3;
		System.out.println(t1.area());
		System.out.println(t1.perimeter());
		Triangle t2 = new Triangle (Math.sqrt(29),5,2);
//		t2.setA(Math.sqrt(29));
//		t2.setB(5);
//		t2.setC(2);
//		t2.a=Math.sqrt(29);
//		t2.b=5;
//		t2.c=2;
		System.out.println(t2.area());
		System.out.println(t2.perimeter());
	}
}

