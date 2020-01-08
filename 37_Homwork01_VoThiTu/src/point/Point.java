package point;

import java.util.Scanner;

public class Point {
	private double x,y;
	public double getX(){
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	public Point() {
		
	}
	public	Point(double x , double y) {
		setX(x);
		setY(y);
		
	}
	public void input () {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x : ");
		setX(input.nextInt());
	
		System.out.println("Enter y : ");
		int y=input.nextInt();
		setY(y);
	}
	public void output() {
		System.out.println("("+ this.x + ";" + this.y +")");
	}
	public double distence(Point b) {
		return Math.sqrt(Math.pow(b.x- this.x,2)+ Math.pow(b.y- this.y,2));
	}
	public double area(Point b, Point c) {
		double ab,ac,bc,p;
		ab=this.distence(b);
		ac=this.distence(c);
		bc=b.distence(c);
		if(ab+ac>bc && bc+ac>ab && ab+bc>ac) 
		{
			p=(ab+ac+bc)/2;
			return Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
		}
		else
		{
			System.out.println("it is not triangle ");
			return 0;
			}
		}
	public Double perimeter(Point b, Point c) {
		double ab,ac,bc,p;
		ab=this.distence(b);
		ac=this.distence(c);
		bc=b.distence(c);
		if(ab+ac>bc && bc+ac>ab && ab+bc>ac) 
		{
			p=(ab+ac+bc);
			return p;
		}
		else
		{
			System.out.println("it is not triangle ");
			return null;
			}
		}
	
	public static void main(String[] args) {
		double s;
		Point a= new Point();
		a.input();
		a.output();
		
		Point b= new Point();
		b.input();
		b.output();
		
		Point c =new Point(3,5);
		c.output();	
		
		System.out.println( s =a.area(b,c));
		System.out.println( s =a.perimeter(b,c));
	}
}
