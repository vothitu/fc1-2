package ex;

import java.util.Stack;

public class Expresstion {
	private String srt;
	public void input()
	{
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Enter string : ");
		srt = in.next();
		in.nextLine();
	}
	public boolean checkBracker()
	{
		Stack<String> s = new Stack<String>();
		for(int i = 0 ; i <  srt.length() ; i++)
		{
			if(srt.charAt(i) == '(')
				s.add(String.valueOf(srt.charAt(i)));
			else if(srt.charAt(i) == ')' && s.empty()) 
				return false;
			else s.pop();
		}
		if(s.empty())
			return true;
		return false;
	}
	public static void main(String[] args) {
		Expresstion a=new Expresstion();
		a.input();
		System.out.println(a.checkBracker());
	}
}