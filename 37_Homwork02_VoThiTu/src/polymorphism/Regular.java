package polymorphism;

import java.util.Scanner;

public class Regular extends Employee
{
	private int yearOfExperience; // so nam kinh nghiem
	private double rate, basicSalary; //he so luong, luong co ban
	
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int y) {
		this.yearOfExperience=y;
	}
//	public double getRate() {
//		return rate;
//	}
//	public void setRate(double r) {
//		this.rate=r;
//	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double b) {
		this.basicSalary=b;
	}
	public  Regular() {
		super();
	}
	public Regular(String n,String p,boolean g, Address add,Date bad,String id, String pt,double alw,int y, double r, double b ) {
		super(n,p,g,add,bad,id,pt,alw);
		this.yearOfExperience=y;
		this.rate=r;
		this.basicSalary=b;
	}
	public double ComputeSalary() {
		double d= this.rate*this.basicSalary + this.allowance ;
		return d;
		
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter year:");
		this.setYearOfExperience(kb.nextInt());
		System.out.println("Enter rate:");
		if(this.yearOfExperience<25)
			this.rate=yearOfExperience/3*0.33+2.33;
			else
				this.rate= 8*0.33+2.33;
		System.out.println(rate);
		System.out.println("Enter basicsalary :");
		this.setBasicSalary(kb.nextDouble());
		super.input();
		
	}
	public void output() {
		System.out.println(this.yearOfExperience);
		System.out.println(this.rate);
		System.out.println(this.basicSalary);
		
		super.output();
	}
	public static void main(String[] args) {
		Regular a= new Regular();
		a.input();
		a.output();
		System.out.println(" computerSalary: " + a.ComputeSalary());
		


	}

}
