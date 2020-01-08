package person;

import java.util.Scanner;

public class Candidate {
	private int codeID, testMark1, testMark2, testMark;
	private String name;
	private Date bad= new Date();
	private Address add= new Address();
	private String averageMark;
	public int getCodeID() {
		return codeID;
	}
	public int getTestMark1() {
		return testMark1;
	}
	public int getTestMark2() {
		return testMark2;
	}
	public int getTestMark() {
		return testMark;
	}
	public String getName() {
		return name;
	}
	public void setCodeID(int ID) {
		this.codeID=ID;
	}
	public void setTestMark1(int mark1) {
		this.testMark1=mark1;
	}
	public void setTestMark2(int mark2) {
		this.testMark2=mark2;
	}
	public void setTestMark(int mark) {
		this.testMark=mark;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Date getDate() {
		return bad;
	}
	public void setDate(Date bad) {
		this.bad=bad;
	}
	public Address getAddress() {
		return this.add;
	}
	public void setAddress(Address add) {
		this.add=add;
	}
	public double AverageMark1()
	{
		int a;
		a=(((testMark1 + testMark2)/2) + (testMark *2))/3;
		return a;
	}
	public String AverageMark()
	{
		double average=(((testMark1 + testMark2)/2) + (testMark *2))/3;
		if(average>=8 ) {
			return  "Good";
		}
		else 
			if(average>=7) 
				return "Fairly good ";
			else
				if(average >=5) 
					return  "average ";
				else {
					return" Fail";
				}
	}
	public void input () {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter codeID: ");
		this.setCodeID(in.nextInt());
		System.out.println("Enter fullname : ");
		this.setName(in.nextLine());
		this.setName(in.nextLine());
		bad.output();
		System.out.println("Enter testMark1 : ");
		this.setTestMark1(in.nextInt());
		System.out.println("Enter testMark2 : ");
		this.setTestMark2(in.nextInt());
		System.out.println("Enter testMark : ");
		this.setTestMark(in.nextInt());
		
		//System.out.println(this.add);
		add.input();
		//System.out.println(this.bad);
		bad.input();
			
	}
	public void output() {
		System.out.println(name );
		System.out.println("codeID : " + codeID);
		System.out.println(testMark1);
		System.out.println(testMark2);
		System.out.println(testMark);
		add.output();
		bad.output();
		
	}
	
	public static void main(String[] args) {
		Candidate a=new Candidate();
		a.input();
		a.output();
		System.out.println(a.AverageMark1());
		System.out.println(a.AverageMark());
		
		Address add = new Address();
		add.input();
		add.output();
		Date bad = new Date();
		bad.input();
		bad.output();
	
		

	}

}
