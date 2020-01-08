package equation;

import java.util.Scanner;

public class SquarEquation extends LinearEquation
{
	private double a;
	//ham khoi tao ko doi so
	
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a=a;
	}
	public   SquarEquation() {
		super();
	}
	public   SquarEquation(double a, double b, double c) {
		super(b,c);
		setA(a);
	}
	public void input() {
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter a: ");
		this.a=kb.nextDouble();
		super.input();
	}
	public void solve1() 
	{
		if(a==0) 
			super.solve();
		else {
			if((b*b-4*a*c)<0)
				System.out.println("phuong trinh vo nghiem");
			else 
				if((b*b-4*a*c)==0)
					System.out.println("x = " + (-b/2*a));
				else 
				{
					System.out.println("x1 = " +  (-b-Math.sqrt(b*b-4*a*c))/2*a);
					System.out.println("x2 = " +  (-b+Math.sqrt(b*b-4*a*c))/2*a);	
					
				}
			}
	}
	@Override
	public void f(int a, int b ) {
		System.out.println(a+b);
	}
	public void f(double a,double b) {
		System.out.println(a+b);
	}
	public void f(double a, double b, double c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) 
	{
		SquarEquation t1= new SquarEquation();
		t1.input();
		t1.solve1();
	}
}
