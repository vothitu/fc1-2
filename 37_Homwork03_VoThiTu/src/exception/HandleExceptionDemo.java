package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleExceptionDemo {

	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		boolean continueInput = true;
		
		do {
			try {
				System.out.println(" Enter an intrger: ");
				int number = kb.nextInt();
				System.out.println(
						"the number entered is "+ number);
				continueInput = false;
				
				
			}
			catch(InputMismatchException ex) {
				System.out.println("try again. (" +
					"Incorrect input: an interger is requires)");
			}
			}
			while(continueInput);
		}
}
