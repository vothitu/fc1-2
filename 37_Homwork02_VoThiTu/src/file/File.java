package file;

import java.util.Scanner;

public class File {

	public static void main(String[] args){
		int sint=0;
		double sDouble=0;
		Scanner kb1= new Scanner(System.in);
		System.out.println("Enter string s: ");
		String s = kb1.nextLine();
		System.out.println(s);
		/*
		Scanner kb2= new Scanner(s);
		while( kb2.hasNext()== true) {
			if(kb2.hasNextInt()== true)
				sint=sint+kb2.nextInt();
			else
				if(kb2.hasNextDouble()== true)
					sDouble+=kb2.nextDouble();
				else kb2.next();
		}
			System.out.println(sint);
			System.out.println(sDouble);
	*/
		Scanner kb3= new Scanner(s);
		String sNew="";
		while(kb3.hasNext()== true) {
			sNew = kb3.next()+ " "+ sNew;
		}
		System.out.println(sNew);
		
		String str=s;
		int index = str.lastIndexOf(" ");
		System.out.println(index);
		
		String lastName = str.substring(index+1);
		String fullName = str.substring(0, index);
		System.out.println(lastName);
		System.out.println(fullName);

	}
}
