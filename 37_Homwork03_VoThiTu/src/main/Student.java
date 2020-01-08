package main;

public class Student {
	private int rollno;
	private String name;
	private String city;
	
	public Student(int rollno, String name, String city) {
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	public String toString () {
		return rollno+" "+name+" "+city;
	}

	public static void main(String[] args) {
		Student s1= new Student(101,"raj","lucknow");
		Student s2= new Student(102,"vljay","jfgjkdf");
		System.out.println(s1);
		System.out.println(s2);

	}

}
