package khudequy;

import java.util.Stack;

public class factorial{
	public static long factorial(int n)
	{
		long m = 1;
		Stack<Integer> s = new Stack<Integer>();
		while(n!=0) {
			s.push(n);
		}
		while(!s.isEmpty())
			m*=s.pop();
		return m;
	}
	public static void boiso(int n,int m)
	{
		Stack<Integer> t = new Stack<Integer>();
		while(n > 0)
		{
			t.push(n-m);
			n=n-m;
		}
		if(t.peek() == 0)
			System.out.println("La boi so cua "+m);
		else System.out.println("Khong la boi so cua "+m);
			
	}
	public static int sum(int n)
	{
		int s = 0;
		Stack<Integer> t = new Stack<Integer>();
		while(n > 0)
			t.push(n--);
		while(!t.isEmpty())
			s=s+t.pop();
		return s;
	}
	public static int sumLe(int n)
	{
		int s = 0;
		Stack<Integer> t = new Stack<Integer>();
		n = n % 2 == 0 ? n-1 : n;
		while(n > 0)
		{
			t.add(n);
			n=n-2;
		}
		while(!t.isEmpty())
			s= s+t.pop();
		return s;
	}
	public static String doiHe(int n,int k)
	{
		String s = "";
		Stack<Integer> t = new Stack<Integer>();
		while(n!=0)
		{
			t.add(n%k);
			n=n/k;
		}
		while(!t.isEmpty())
			if(t.peek() < 10)
				s=s+t.pop();
			else s=s+ (char)(t.pop() +55);
		return s;
	}
	public static String reverse(String s)
	{
		String answer = "";
		Stack<Character> t = new Stack<Character>();
		for(int i = 0 ; i < s.length() ; i++)
			t.add(s.charAt(i));
		while(!t.isEmpty())
			answer=	answer+t.pop();
		return answer;
	}
	public static int layDu(int n,int k)
	{
		Stack<Integer> t = new Stack<Integer>();
		if(k == 0 || n == 0)
			return 0;
		while(n >= k)
		{
			t.add(n= n-k);
		}
		return t.pop();
	}
	//
	public static int layNguyen(int n,int k)
	{
		Stack<Integer> t = new Stack<Integer>();
		
		if(k == 0 || n == 0)
			return 0;
		while(n >= k)
		{
			t.add(n= n-k);
		}
		
		int s = 0;
		while(!t.isEmpty())
		{
			t.pop();
			s++;
		}
		return s;
	}
	//mu 2
	public static int mu(int n)
	{
		int s = 0;
		Stack<Integer> t = new Stack<Integer>();
		t.push(n);
		while(!t.isEmpty())
		{	
			if(t.peek() == 0)
			{
				s=s+1;
				t.pop();
			}
			else {
				int tmp = t.pop()-1;
				t.push(tmp);
				t.push(tmp);
			}
		}
		return s;
	}
	//x mu y
	public static int mu(int x,int y)
	{
		if(x == 0)
			return 0;
		if(y == 0)
			return 1;
		int s = 1;
		Stack<Integer> t = new Stack<Integer>();
		for(int i = 0 ; i < y ; i++)
			t.push(x);
		while(!t.isEmpty())
			s= s*t.pop();
		return s;
	}
	public static void main(String[] args) {
		factorial a= new factorial();
		System.out.println(a.factorial(4));
		a.boiso(9, 3);
		System.out.println(a.sum(3));
		System.out.println(a.sumLe(7));
		System.out.println(a.doiHe(161, 16));
		System.out.println(a.reverse("vothitu"));
		System.out.println(a.layDu(5, 4));
		System.out.println(a.layNguyen(6, 3));
		System.out.println(a.mu(4));
		System.out.println(a.mu(4,2));
	}
}
