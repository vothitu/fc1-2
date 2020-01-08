package bst;

import java.util.Random;

public class Sort {
	int []a;
	int []b;
	void sinh(int n) {
		a=new int [n];
		b=new int[n];
		Random rd=new Random();
		for(int i=0;i<n;i++) {
			a[i]=rd.nextInt();
			b[i]=a[i];
		}
	}
	void chep(int n) {
		for(int i=0;i<n;i++) {
			a[i]=b[i];
		}
	}
	void in() {
		
	}
	void selectSort() {
		
	}
	void BubbleSort() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
