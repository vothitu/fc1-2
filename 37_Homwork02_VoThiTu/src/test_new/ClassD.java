package test_new;
import test.ClassA;
public class ClassD extends ClassA  {
	public void display4() {
		ClassA a= new ClassA();
		System.out.println(a.x);//error
		System.out.println(a.pvt);//error
		System.out.println(pro);
		System.out.println(a.pb);

	}


}
