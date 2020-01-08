package polymorphism;

import java.util.Scanner;

public class Person {
	protected String fullname;
	protected boolean gender;
	protected String phoneNumber;
	protected Address add = new Address();
	protected Date bad = new Date();
	
	public Address getAddress() {
		return add;
	}
	public void setAddress(Address add){
		this.add=add;
	}
	public Date getDate() {
		return bad;
	}
	public void setDate(Date bad) {
		this.bad=bad;
	}
	public String getFullname() {
		return fullname;
	}
	public boolean getGender() {
		return gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setFullname(String n) {
		this.fullname=n;
	}
	public void setGender(boolean g) {
		this.gender=g;
	}
	public void setPhoneNumber(String p) {
		this.phoneNumber=p;
	}
	public Person() {
		this.fullname ="";
		this.phoneNumber = "";
		
	}
	public Person(String n,  String p, boolean g , Address add, Date bad) {
		this.fullname=n;
		this.phoneNumber=p;
		this.gender=g;
		this.add=add;
		this.bad=bad;
		
	}
	public void input () {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter fullname : ");
		this.setFullname(in.nextLine());
		
		System.out.println("Enter gender : ");
		this.setGender(in.nextBoolean());
		System.out.println("Enter phoneNumber : ");
		this.setPhoneNumber(in.nextLine());
		this.setPhoneNumber(in.nextLine());
		System.out.println("Enter address: ");
		add.input();
		System.out.println("Enter date: ");
		bad.input();
	}
	public void output() {
		System.out.println(this.fullname);
		System.out.println(this.gender);
		System.out.println(this.phoneNumber);
		System.out.println(this.add);
		add.output();
		System.out.println(this.bad);
		bad.output();
	}
	public static void main(String[] args) {
			
			Person p1=new Person();
			p1.input();
			p1.output();
			Address add=new Address();
			Date bad=new Date();
	}
}
