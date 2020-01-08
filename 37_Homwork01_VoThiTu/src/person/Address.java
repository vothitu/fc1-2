package person;

import java.util.Scanner;

public class Address {
	private String number, streest, district, city;
	public String getNumber() {
		return number;
	}
	public String getStreest() {
		return streest;
	}
	public String getDistrict() {
		return district;
	}
	public String getCity() {
		return city;
	}
	public void setNumber(String n) {
		this.number=n;
	}
	public void setStreest(String s) {
		this.streest=s;
	}
	public void setDistrict(String d) {
		this.district=d;
	}
	public void setCity(String c) {
		this.city=c;
	}
	public    Address() {
		this.number = "";
		this.streest = "";
		this.district= "";
		this.city= "";
		
	}
	public    Address(String n, String s, String d, String c) {
		this.number=n;
		this.streest=s;
		this.district=d;
		this.city=c;
	}
	public void input () {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number : ");
		this.setNumber(kb.nextLine());

		System.out.println("Enter streest : ");
		this.setStreest(kb.nextLine());
		
		System.out.println("Enter district : ");
		this.setDistrict(kb.nextLine());
		
		System.out.println("Enter city : ");
		this.setCity(kb.nextLine());
	}
	public void output() {
		System.out.println(this.number );
		System.out.println(this.streest );
		System.out.println(this.district );
		System.out.println(this.city );
		
	}
	public static void main(String[] args) {
		Address  a = new Address();
		a.input();
		a.output();
		
		/*Address a2 = new Address("102","phan thanh","thanh khe","da nang");
		a2.output();
		
		String number=" 40";
		String streest= "nguyen duc trung";
		String district = "thanh khe";
		String city = "da nang";
		Address a3 = new Address(number, streest, district, city);
		a3.output();
		
		Address a4 = a3;
		a4.output();*/

	}

}
