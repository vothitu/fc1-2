package polynomial;

import java.util.Scanner;

public class Polynomil {
	//khai bao bien
	private double coefficient;
	private int exponent;
	public double getCoefficient() {
		return coefficient;
	}
	public int getExponent() {
		return exponent;
	}
	public void setCoefficient(double c) {
		this.coefficient=c;
	}
	public void setExponent(int e) {
		if(e<0) this.exponent=0;
		else
			this.exponent=e;			
	}
	//goi ham khoi tao khong doi so
	public   Polynomil() {
		coefficient=0;
		
	}
	//goi ham khoi tao co doi so
	public   Polynomil(double c,int e) {
		setCoefficient(c);
		setExponent(e);
	}
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter coefficient : ");
		this.setCoefficient(in.nextDouble());
		
		System.out.println("Enter exponent : ");
		this.setExponent(in.nextInt());
	}
	public void output() {
		System.out.println(this.coefficient+"x^"+this.exponent );
	}
	public double f(double x) {
		return this.coefficient*Math.pow(x, this.exponent);
	}
	public double ff(double x) {
		return this.coefficient*this.exponent*Math.pow(x,this.exponent);
	}
	public static void main(String[] args) {
		//tao ra cac doi tuong co gai tri rieng biet
		Polynomil p1 = new Polynomil();
		p1.input();
		p1.output();
		System.out.println(p1.f(2));
		System.out.println(p1.ff(3));
	}

}
