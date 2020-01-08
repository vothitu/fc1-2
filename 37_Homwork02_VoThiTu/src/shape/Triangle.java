package shape;

import java.util.Scanner;

public class Triangle extends Shape
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
	@Override
	public void input()
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter the a: ");
		this.setA(kb.nextDouble());
		System.out.println("Enter the b: ");
		this.setB(kb.nextDouble());
		System.out.println("Enter the c: ");
		this.setC(kb.nextDouble());
		
		
		
	}
	@Override
	public void output() {
		System.out.println("triangle: ");
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
	//cai dat ca phuong thuc
	@Override
	public double area()
	{
		if(a+b>c && b+c>a && a+c>b) 
		{
			double p=(a+b+c)/2;
			return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		}
		else
		{
			System.out.println("it is not triangle ");
			 return (Double) null;
		}
	}
	@Override
	public double perimeter()
	{
		if(a+b>c && a+c>b && b+c>a)
		{
			return a+b+c;
		}
		else 
		{
			System.out.println("it is not Triangle ");
			return (Double) null;
		}
	}

	public static void main(String[] args) 
	{
		//tao cac doi tuong co gia tri cu the rieng biet
		Triangle t1 = new Triangle ();
		t1.input();
		t1.output();
		System.out.println(" area: " +t1.area());
		System.out.println("perimerter: "+ t1.perimeter());
	}
}

