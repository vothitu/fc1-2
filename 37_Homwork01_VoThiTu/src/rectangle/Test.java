package rectangle;

import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter something: ");
		System.out.println("nhap a: ");
		int a=kb.nextInt();
		System.out.println("nhap b: ");
		double b=kb.nextDouble();
		kb.nextLine();
		System.out.println("nhap tu: ");
		String word = kb.next();
		kb.nextLine();
		System.out.println("nhap chuoi: ");
		String sentence = kb.nextLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(word);
		System.out.println(sentence);
	}
}