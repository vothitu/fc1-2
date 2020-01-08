package polymorphism;

import java.util.Scanner;

public class ArrayOfEmployee extends Employee {
	private int n;
	private Employee[] a = new Employee[100];
	public int getN()
	{
		return n;
	}
	public void setN(int nn)  
	{
		this.n=n;
	}
	public ArrayOfEmployee() {
		
	}
	public ArrayOfEmployee(int n) {
		this.setN(n);
	}
	
	public void input() {
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter n: ");
		n=kb.nextInt();
		for(int i=0;i<n;i++) 
		{
			System.out.println("person "+(i+1)+ ":");
			System.out.println("1-Regular/2-Contract");
			int choose = kb.nextInt();
			if(choose==1)
			{
				Employee e= new Regular();
				e.input(); // tinh da hinh
				a[i]=e;
			}
			else 
				if(choose ==2) 
				{
					Employee e = new Contract();
					e.input();// tinh da hinh
					a[i]=e;
				}
		}
		
	}
	public void output() {
		for(int i=0;i<n;i++) 
		{
			a[i].output();
		}
		System.out.println();
	}
	public double  salaryMax() {
		double max= a[0].computeSalary(); // tinh da hinh
		for(int i=1;i<n;i++)
			if(max<a[i].computeSalary())// tinh da hinh
				max=a[i].computeSalary();// tinh da hinh
		return max;
	}
	//dem có bao nhieu nhan vien regular, nv contract
	public void count() {
		int c1=0, c2=0;
		for(int i=0;i<n;i++)
			if(a[i] instanceof Regular) c1++;
			else c2++;
		System.out.println(c1+"\t"+c2);
	}
	
	
	public static void main(String[] args) {
		ArrayOfEmployee a= new ArrayOfEmployee();
		a.input();
		a.output();
		System.out.println("salaryMax: "+ a.salaryMax()); 
		a.count();
	}

}
