package test;

public class ClassC{
	public void display3() {
		ClassA a= new ClassA();
		System.out.println(a.x);
		System.out.println(a.pvt); //error
		System.out.println(a.pro);
		System.out.println(a.pb);

	}
}
