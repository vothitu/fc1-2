package bill;

import java.util.Scanner;

public class Bill {
	private Item d[]=new Item[100];
	private int n;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		if(n<0) this.n=0;
		else
			this.n=n;
	}
	public void input() {
		Scanner  kb= new Scanner(System.in); 
		System.out.print("How many items int this bill: ");
		this.n=kb.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Item" +( i+1) +":" + "cake"  );
			Item a= new Item();
			d[i].output();
			d[i]=a;
		}
		}	

	public void output() {
		System.out.println("Bill");
		for(int i =0;i<n;i++) 
			System.out.println("");
	}
	public void minPrice() {
		int min=0;
		for(int i=0;i<n;i++) {
			if(min>d[i].getitemPrice()) {
				min=d[i].getitemPrice();
				d[i].output();
			}
			
		}
	}
	public void maxPrice() {
		int max=0;
		for(int i=0;i<n;i++) {
			if(max<d[i].getitemPrice()) {
				max=d[i].getitemPrice();
				d[i].output();
			}
		}
	}
	public void total() {
		
	}
	public static void main(String[] args) {
		Bill a = new Bill();
		a.input();
		

	}

}
