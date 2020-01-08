package array_of_integer;

import java.util.Scanner;

public class ArrayOfInteger {
	private int[] a= new int [100];
	private int n;
	public int getN() {
			return n;
	}
	public void setN(int n) {
			this.n=n;
	}
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter n : ");
		this.setN(kb.nextInt());
		for(int i =0; i<this.n; i++) {
			System.out.println("Enter a["+i+"] : ");
			this.a[i]=kb.nextInt();
		}
	}
	public void output() {
		for(int i =0; i<this.n; i++) {
		System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	public ArrayOfInteger() {
		
	}
	public ArrayOfInteger(int n) {
		setN(n);
	}
	public void printEven() {
		for(int i =0; i<this.n; i++)
			if(this.a[i]%2==0) { 
				System.out.print(a[i]+"  ");
			}
	}
	public double oddAray() {
		double sum=0,d =0;
		for(int i =0; i<this.n; i++)
			if(a[i]%2==1) {
				sum+=a[i];
				d++;
			}
		if(d == 0) return 0;
		return (int)(sum/d*100)/100.0;
	}
	public int max() {
		int m= a[0];
		for(int i=0; i<this.n; i++) 
			if(m<a[i])
				m= a[i];
		return m;
			
	}
	public int sumMax1() {
		int max=a[0]+a[1];
		for(int i=0;i<this.n;i++) {
			if(max<(a[i]+ a[i+1]))
					max=(a[i]+a[i+1]);
		}
		return max;
	}
	public void sumMax2() {
		int max2=a[0]+a[1],vt1=0, vt2=0;
		for(int i=0;i<this.n-1;i++) { 
			for (int j=i+2;j<this.n;j++) {
				if(max2<a[i]+a[j]) {
					max2=a[i]+a[j];
					vt1=i;
					vt2=j;
				}
			}
		}
		System.out.println(max2);
		System.out.println(a[vt1]);
		System.out.println(a[vt2]);
		
	}
	public void printPrine() {
		for(int i=0;i<this.n;i++) {
			int d=0;
			for(int k=1;k<=a[i];k++) {
				if(a[i]%k==0) 
					d=d+1;
			}
			if(d==2)
				System.out.print(a[i] + " ");
		}
		for(int i=0;i<this.n;i++)
		System.out.println();
	}
	public boolean search (int x) {
		for(int i=0;i<this.n;i++) {
			if(a[i]==x)
				return true;
		}
		return false;
	}
	public void remove(int index) {
		for(int i=index;i<this.n-1;i++)
			a[i]=a[i+1];
		n--;
			for(int i=0; i<n;i++)
				System.out.print(a[i]+" ");
		
	}
	public void insert(int x, int index) {
		for(int i =n-1; i>=index; i--)//vong lap for dich tung phan tu tu n-1 ve den index
		{
			a[i+1]=a[i];
		}
		a[index]=x;//them phan tu x vao vi tri bat kì trong mang
		n++; //sau khi thêm thì mang tang len 1 phan tu- so luong phan tu tang len 1 don vi
		for(int i=0; i<n;i++)
			System.out.print(a[i]+" ");
	
	}
	public void sort() {
		for(int i=0;i<this.n-1;i++) {
			for(int j=i+1;j<this.n;j++) {
				if(a[i]>a[j]) {
					int tmp=a[0];
					tmp=a[j];
					a[j]=a[i];
					a[i]=tmp;
					
				}
			}
		}
		for(int i=0; i<this.n;i++) {
		System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		ArrayOfInteger a1= new ArrayOfInteger();
		a1.input();
		a1.output();
		System.out.print("Even : ");
		a1.printEven();
		System.out.println();
		System.out.println("addRay : " + a1.oddAray());
		System.out.println("max: "+ a1.max());
		System.out.println("summax1: "+ a1.sumMax1());
		a1.sumMax2();
		a1.printPrine();
		System.out.print(a1.search(3));
		System.out.println();
		a1.remove(3);
		System.out.println();
		a1.insert(3,2);
		System.out.println();
		a1.sort();
		
		}
	}