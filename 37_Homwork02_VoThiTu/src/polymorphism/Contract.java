package polymorphism;

import java.util.Scanner;

public class Contract extends Employee {
	private double gradeSalary;
	
	public double getGradeSalary() {
		return  gradeSalary;
	}
	public void setGradeSalary(double  gradeSalary) {
		this. gradeSalary= gradeSalary;
	}
	public Contract() {
		super();
	}
	public Contract(String n,String p,boolean g, Address add,Date bad,String id,String pt,double alw, double gradeSalary) {
		super(n,p,g,add,bad,id,pt,alw);
		this.getGradeSalary();
	}
	public double computeSalary() {
		double d =  this.getGradeSalary() + this.allowance;
		return d;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the gradeSalary:");
		this.setGradeSalary(kb.nextDouble());
		super.input();
	}
	public void output() {
		System.out.println(this.gradeSalary);
		super.output();
	}

	public static void main(String[] args) {
		Contract w= new Contract();
		w.input();
		w.output();
		System.out.println("complete: "+w.computeSalary());
		

	}

}
