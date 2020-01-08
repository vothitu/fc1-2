package polymorphism;

import java.util.Scanner;
// lop tru truong 
public abstract class Employee extends Person
{
	protected String id;
	protected String position;
	protected double allowance;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String pt) {
		this.position=pt;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double alw) {
		this.allowance=alw;
	}
	public  Employee() {
		super();		//goi ham khoi tao khong doi so cua class person
		this.id="";
		this.position="";
	}
	public Employee(String n,String p,boolean g, Address add,Date bad,String id,String pt,double alw) {
		super(n,p,g,add,bad);	//goi ham khoi tao co doi so cua class person
		this.id=id;
		this.position=pt;
		this.allowance=alw;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the id:");
		this.setId(kb.nextLine());
		System.out.println("Enter the position:");
		this.setPosition(kb.nextLine());
		System.out.println("Enter allowance:");
		this.setAllowance(kb.nextDouble());
		super.input();		//goi ham input cua class person
	}
	public void output() {
		System.out.println(this.id);
		System.out.println(this.position);
		System.out.println(this.allowance);
		super.output();		//goi ham output cua lop person
	}
	// 
	public abstract double computeSalary();
	

	public static void main(String[] args) {
		Employee e=new Employee(); // lop truu tuong khong duoc new chinh ban than no, new thong qua lop con no.
		e.input();
		e.output();

	}

}
