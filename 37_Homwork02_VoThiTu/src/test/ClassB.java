package test;

public class ClassB extends ClassA {
	public void display2() {
		System.out.println(x);
		System.out.println(pvt); //error
		System.out.println(pro);
		System.out.println(pb);

	}

}
