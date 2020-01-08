package quan_li_ban_hang;

import java.util.Scanner;

public class ArrayOfPhieu {

	private int n;
	private Phieu []a=new Phieu[100];
	public int getN() {
		return this.n;
	}
	public void setN(int n) {
		this.n=n;
	}
	//Cài đặt phương thức
	
	public void input() {
		
		Scanner h=new Scanner(System.in);
		System.out.println(" Enter so mat hang : ");
		setN(h.nextInt());
		for(int i=0;i<n;i++) {
			System.out.println("Enter element"+ i + ":");
			//khoi tao va nhap Phieu
			Phieu f=new Phieu();
			f.input();
			a[i]=f;

		}
	}
	
	public void output() {
		for(int i=0;i<n;i++) {
			a[i].output();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayOfPhieu h=new ArrayOfPhieu();
		h.input();
		h.output();
	}
}
