package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sort {
	private int[] a;
	private int n;
	public void setN(int n) {
		this.n=n;
	}
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter n : ");
			int n= kb.nextInt();
			a=new int[n];
		for(int i=0;i<n;i++)
			this.a[i]=kb.nextInt();
	}
	public void in()
	{
	System.out.print("\n Noi dung mang:\n");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
	}
	public void Radix_Sort() {
		Queue q = new LinkedList();
		Queue []qq; 
		qq= new LinkedList[10];
		for (int i=0; i<=9; i++) 
			qq[i]= new LinkedList();
		int x, vt, d=1, max=a[0];
		for(int i=0; i<a.length; i++) { 
			if(a[i]>max) max=a[i]; 
			q.add(a[i]); 
		}
		int k= (new Integer(max)).toString().length();
		for(int i=1; i<=k; i++) {
		while(!q.isEmpty()) { 
			x= (int) q.remove(); 
		vt= (x/d)%10; 
		qq[vt].add(x); 
		}
		for(int j=0; j<=9; j++)
		while(!qq[j].isEmpty()) { 
			x= (int) qq[j].remove(); 
			q.add(x); }
		d=d*10;
		}
		for(int i=0; i<a.length; i++)
			a[i]= (int) q.remove();
		}
	public static void main(String[] args) {
		Sort a = new Sort();
		a.input();
		a.in();
		a.Radix_Sort(); 
		a.in();
		}
}

