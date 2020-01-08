package equation;

public class Text {
	
	public static void main(String[] args) {
		// cha new cha 
		LinearEquation linear = new LinearEquation();
		//linear.input();
		linear.f(2, 3);
		linear.f1(2, 5, 1);
		linear.setC(3);
		System.out.println(linear.GetB());
		System.out.println(linear.GetC());
		
		// con new con,
		// luon chay vao lop con,
		//va con dung duoc cac thuoc tinh va phuong thuc cua cha( vi thua ke) va con
		// nhung: neu method overriding thi dung method cua con
		SquarEquation s= new SquarEquation();
		s.f(2,3);
		
		// cha new con,
		//luon chay vao lop cha va dung duoc cac thuoc tinh va phuong thuc cua cha
		// nhung: neu method overriding thi nhay qua goi method cua con
		LinearEquation l= new SquarEquation();
		l.f(2, 4);// vi method override nen nhay qua con

	}

}
