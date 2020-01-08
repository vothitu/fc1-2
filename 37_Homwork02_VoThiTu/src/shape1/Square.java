package shape1;

import java.util.Scanner;

public class Square extends Rectangle{
	// ko co thuoc tinh vi thua ke thuoc tinh tu lop cha Rectangle
	public Square() {
		super();
	}
	public Square(double edge) {
		super(edge,edge);
	}
	@Override
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter adge:");
		width=length=kb.nextDouble();
	}
	@Override
	public void output() {
		System.out.println(width);
	}
	
	public static void main(String[] args) {
		Square r1= new Square();
		r1.input();
		r1.output();
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		

	}

}
