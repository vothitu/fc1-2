package triangle;

import java.util.Scanner;

public class Student 
{ 
    private String fName; 
    public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	private String lName; 
    private int age; 
     
    public Student() 
    { 
   
    } 
    public Student(String fName, String lName, int age) 
    { 
        this.fName=fName; 
        this.lName=lName; 
        this.age=age; 
    } 
    public void input() {
    	Scanner kb= new Scanner(System.in);
    	System.out.println("fName");
    	this.fName=(kb.nextLine());
    	System.out.println("lName");
    	this.lName=(kb.nextLine());
    	System.out.println("age");
    	this.age=(kb.nextInt());
    	
    	
    }
    public void output() {
    	System.out.println(this.fName);
    	System.out.println(this.lName);
    	System.out.println(this.age);
    }
    public String toString() 
    { 
        return "Ten: "+this.fName+"\nHo: "+this.lName+"\nTuoi:"+this.age; 
    } 
     
     
    public static void main(String args[]) 
    { 
    	Student p1=new Student();
    	p1.input();
    	p1.output();
         
        System.out.println(p1); 
    } 
}