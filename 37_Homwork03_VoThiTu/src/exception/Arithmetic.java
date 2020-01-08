package exception;

import java.util.Scanner;

public class Arithmetic {
	public static void devide() {
		Scanner kb = new Scanner(System.in);
		int b=kb.nextInt();
		int a= 50;
		a=a/b;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		devide();

	}

}
