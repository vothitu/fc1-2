package shape1;

import java.util.Scanner;

public class Cylinder extends Circle 
{
	// ko co thuoc tinh vi thua ke thuoc tinh tu lop cha Rectangle
	private double height;
	public double getHeight(){
		return this.height;
	}
	public void setHeight(double h) {
		if(h<0) height=0;
		else 
			height=h;
	}
	public Cylinder() {
		super();
	}
	public Cylinder(double r) {
		super(r);
	}
	@Override
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter radius:");
		this.setRadius(kb.nextDouble());
		System.out.println("Enter height: ");
		this.setHeight(kb.nextDouble());			
	}
	@Override
	public void output() {
		System.out.println(radius);
		System.out.println(height);
	}
	public double area1() {
		return Math.PI*2*radius*height;
	}


	public static void main(String[] args) {
		Cylinder a= new Cylinder();
		a.input();
		a.output();
		System.out.println("area: " +(a.area1() +2*a.area()));

	}

}
