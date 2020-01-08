package fraction;

import java.util.Scanner;

public class Fraction {
	//khai bao thuoc tinh
	private int numerator, denominator;
	public int getNumerator() {
		return this.numerator;
	}
	public int getDenominator() {
		return this.denominator;
	}
	public void setNumerator(int n) {
		this.numerator=n;
	}
	public void setDenominator(int d) {
		if(d==0) this.denominator=1;
		else
			this.denominator=d;
	}
	// ham khoi tao khong doi so
	public    Fraction(){
		this.denominator=1;
		
	}
	//ham khoi tao co doi so
	public   Fraction(int n, int d) {
		this.numerator=n;
		this.denominator=d;
	}
	public void input () {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numerator : ");
		int n=input.nextInt();
		setNumerator(n);
		int d;
		do
		{
			System.out.println("Enter denominator: ");
			d = input.nextInt();
		}   while(d==0);
		setDenominator(d);
	}
	public void output() {
		System.out.println(this.numerator+"/"+ this.denominator);
	}
	public Fraction plus(Fraction a2)
	{
		Fraction a3 = new Fraction();
		a3.setNumerator(this.denominator*a2.numerator+ this.numerator*a2.denominator);
		a3.setDenominator(this.denominator*a2.denominator);
		return a3;
	}
	public Fraction subtraction(Fraction a2)
	{
		Fraction a4 = new Fraction();
		a4.setNumerator(this.numerator*a2.denominator - this.denominator*a2.numerator);
		a4.setDenominator(this.denominator*a2.denominator);
		return a4;
	}
	public Fraction multiplication(Fraction a2)
	{
		Fraction a5 = new Fraction();
		a5.setNumerator(this.numerator*a2.numerator);
		a5.setDenominator(this.denominator*a2.denominator);
		return a5;
	}
	public Fraction division(Fraction a2)
	{
		Fraction a6= new Fraction();
		a6.setNumerator(this.numerator*a2.denominator);
		a6.setDenominator(this.denominator*a2.numerator);
		return a6;
	}
	public double division1() {
		return this.getNumerator()/this.getDenominator();
	}
	public int prime(int x) {
		int dem=0;
		for(int t=1;t<x/2;t++)
			if(x%t==0)
				dem++;
		if(dem==1)
			return 1;
		else 
			return 0;
	}
	public static void main(String[] args) 
	{
		//tao cac doi tuong co gia tri cu the 
		Fraction f = new Fraction();
		f.input();
		f.output();
		//System.out.println(f.prime(f.getNumerator()));
	
		/*Fraction a2 = new Fraction(3,4);
		a2.output();
		
		Fraction a3 = a1.plus(a2);
		a3.output();
		
		Fraction a4 = a1.subtraction(a2);
		a4.output();
		
		Fraction a5 = a1.multiplication(a2);
		a5.output();
		
		Fraction a6 = a1.division(a2);
		a6.output();*/
	}

}