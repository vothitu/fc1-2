package dequi;

public class Recursion {
	public static long factorial(int n) {
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	public static void boiso(int n) {
		if(n<0)
			System.out.println("khong phai boi so");
		else
			if(n==0)
				System.out.println("boi so");
			else 
				boiso(n-7);
	}
	public static int tong(int n) {
		if(n==0)
			return 0;
		else
			return n+tong(n-1);
	}
	public static long sumOdd(int n) {
		if(n%2==0)
			return sumOdd(n-1);
		else
			if(n==1)
				return 1;
			else
				return n+ sumOdd(n-2);
	}
	public static long Luythua(int g,int h) {
		if(h==0)
			return 1;
		else
			return g*Luythua(g,h-1);
	}
	public static long mod(int a,int b) {
		if(a<b||a==0)
			return 0;
		else
			return 1+mod(a-b,b);
	}
	public static long UCLN(int a,int b) {
		if(a==0||b==0) {
			return a+b;
		}
		else 
			if(a==b) {
				return a;
			}
			else
				if(a>b) {
					return UCLN(a-b,b);
				}
				else
					return UCLN(a,b-a);
	}
	public static long chiadu(int a, int b) {
		if(a==0)
			return 0;
		if(a>=b) return chiadu(a-b,b);
		else
			return a;
	}
	public static long mu(int n) {
		if(n==0)
			return 1;
		else
			return 2*mu(n-1);
	}
	

	public static void main(String[] args) {
		System.out.println(Recursion.factorial(5));
		Recursion.boiso(12348);
		System.out.println(Recursion.tong(5));
		System.out.println(Recursion.sumOdd(7));
		System.out.println(Recursion.Luythua(3, 3));
		System.out.println(Recursion.mod(2, 2));
		System.out.println(Recursion.UCLN(125, 75));
		System.out.println(Recursion.chiadu(9, 2));
		System.out.println(Recursion.mu(5));
	}

}
