package shape1;

import java.util.Scanner;

public class Rectangle implements Shape
{
	//constructor: ham khoi tao ko doi so
	//gan gia tri mac dinh ban dau cho thuoc tinh cua class
	protected double length, width;
	public   Rectangle () {
		
	}
	
	//constructor: ham khoi tao co doi so
	// truyen tham so ngoai vao cho thuoc tinh cua class
	public   Rectangle(double l, double w) {
		setLength(l);
		setWidth(w);
	}
	//khai bao thuoc tinh
	
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
	@Override
	public void input()
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter the Length: ");
		this.setLength(kb.nextDouble());
		System.out.println("Enter the width: ");
		this.setWidth(kb.nextDouble());
		
		
	}
	@Override
	public void output() {
		System.out.println("rectanger: ");
		System.out.println("area: "+ this.area());
		System.out.println("perimeter: " +this.perimeter());
//		System.out.println(this.length);
//		System.out.println(this.width);
	}
	//cai dat ca phuong thuc
	@Override
	public double area()
	{
		return length * width;
	}
	@Override
	public double perimeter()
	{
		return (length + width)*2;
	}
	
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle ();
		//r1.input();
		//r1.output();
		
		
		}

}
