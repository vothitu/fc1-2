package person;

import java.util.Scanner;

import fraction.Fraction;

public class ArrayOfCandidate {
	private int n;
	private Candidate[] a = new Candidate[100];
	public int getN() 
	{
		return n;
	}
	public void setN(int nn) 
	{
		if(nn<0) n=0;
		else n=nn;
	}
	public void input() 
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter n:");
		n=kb.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter candidate"+ i + ":");
			//khoi tao va nhap candidate
			Candidate c=new Candidate();
			c.input();
			a[i]=c;
		}
	}
	
	public void output() {
		for(int i=0;i<n;i++) 
		{
			a[i].output();
		}
		System.out.println();
	}
	public void pass() {
		int count=0;
		for(int i=0;i<this.n;i++) {
			if(a[i].AverageMark1()>5)
				
					count++;
			
			}
		System.out.println("pass:" + count);
				
	}
	public void pass1() {
		for(int i=0;i<this.n;i++) {
			if(a[i].AverageMark1()>5)
				a[i].output();
			}
	}
	public void month() {
		for(int i=0;i<n;i++)
			if((a[i].getDate()).getMonth()==8)
				a[i].output();
	}
	public void remove(int index) {
		for(int i=index;i<n-1;i++) {
			a[i]=a[i+1]; 
		}
		n--;
		System.out.println();
	}
	public void year() {
		for(int i=0;i<n;i++)
			if((a[i].getDate()).getYear()==2000) {
				remove(i);
				i--;
	}
		for(int i=0;i<this.n;i++)
		a[i].output();
	
	}
	public void street() {
		for(int i=0;i<this.n;i++)
			if((a[i].getAddress()).getStreest()=="nguyen van linh") {
				a[i].output();
			}
		System.out.println();
	}
	public void district() {
		for(int i=0;i<n;i++)
			if((a[i].getAddress()).getDistrict()=="hai chau") {
				a[i].output();
			}
		System.out.println();
	}
	
	public void sort() {
		for(int i=0;i<this.n-1;i++) {
			for(int j=i+1;j<this.n;j++) {
				if((a[i].getDate()).getYear()>(a[j].getDate()).getYear()){
						Candidate T=a[i];
						a[i]=a[j];
						a[j]=T;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayOfCandidate b= new ArrayOfCandidate();
		b.input();
		b.output();
		b.pass();
		b.pass1();
		System.out.println("month: ");
		b.month();
		System.out.println("year: ");
		b.year();
		System.out.println("street: ");
		b.street();
		System.out.println("district: ");
		b.district();
		System.out.println("sort age: ");
		b.sort();
		b.output();
	}

}
