package shape1;

import java.util.Scanner;

public class Circle implements Shape
{
		//khai bao thuoc tinh
	protected double radius;
	 	//constructor: ham khoi tao ko doi so
		//gan gia tri mac dinh ban dau cho thuoc tinh cua class
	public   Circle () {
			setRadius(1);
			
		}
	
		//constructor: ham khoi tao co doi so
		// truyen tham so ngoai vao cho thuoc tinh cua class
	public   Circle(double r) {
		setRadius(r);
		}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		if(r<0) radius=0;
		else 
			radius=r;
	}
	@Override
	public void input()
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		this.setRadius(kb.nextDouble());
	}
	@Override
	public void output() {
		System.out.println("circle: ");
		System.out.println(" area: " +this.area());
		System.out.println("perimerter: "+this.perimeter());
	}
	//cai dat phuong thuc
	@Override
	public double area ()
	{
		return radius*radius*Math.PI;
	}
	@Override
	public double perimeter ()
	{
		return 2*Math.PI*radius;
	}

	public static void main(String[] args) 
	{
		//tao cac doi tuong co gia tri cu the rieng biet
	//	Circle a1 = new Circle ();
		//a1.input();
		//a1.output();
		
		}
}
