package exception;

public class NullPointer {
	public static void nullPointer() {
		String s= null;
		System.out.println(s.length());
	}

	public static void main(String[] args) {
		nullPointer();

	}

}
