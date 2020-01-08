package squar_eqution;

public class SquarEquation 
{
	private double a, b, c;
	//ham khoi tao ko doi so
	public   SquarEquation() {
		a=2;
		b=4;
		c=2;
	}
	public   SquarEquation(int a1, int b1, int c1) {
		setA(a1);
		setB(b1);
		setC(c1);
	}
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	public void setA(double a1) 
	{
	}
	
	public void setB(double b1)
	{
	}
	
	public void setC(double c1) 
	{
	}
	
	public void solve() 
	{
		if(a==0)
			System.out.println("it not SquarEquation");
		else 
			if((b*b-4*a*c)<0)
				System.out.println("phuong trinh vo nghiem");
			else 
				if((b*b-4*a*c)==0)
					System.out.println("x = " + (-b/2*a));
				else 
				{
					System.out.println("x1 = " +  (-b-Math.sqrt(b*b-4*a*c))/2*a);
					System.out.println("x2 = " +  (-b+Math.sqrt(b*b-4*a*c))/2*a);	
				}
	}
	public static void main(String[] args) 
	{
		SquarEquation t1= new SquarEquation();
		System.out.println(t1);
		t1.solve();
		SquarEquation t2= new SquarEquation(6,2,1);
		t2.solve();
		SquarEquation t3= new SquarEquation();
		System.out.println(t3);
		t3.a=1;
		t3.b=7;
		t3.c=2;
		t3.solve();

	}

}
