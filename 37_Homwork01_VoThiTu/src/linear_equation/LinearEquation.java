package linear_equation;

public class LinearEquation 
{
	//khai bao bien
	private double b, c;
	
	//goi ham khoi tao khong doi so
	public   LinearEquation()
	{
		b=1;
		c=2;
	}
	
	//goi ham khoi tao co doi so
	public   LinearEquation(double a1, double a2) 
	{
		setB(a1);
		setC(a2);
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public void setB(double b1) {
	}
	
	public void setC(double c1) {
	}
	
	//cai dat phuong thuc
	public void solve()
	{
		if(b == 0) 
			if(c==0)
				System.out.println("Unlimited roots");
			else
				System.out.println("no root");
		else
			System.out.println(" x = "+ (-c/b));			
	}

	public static void main(String[] args) 
	{
		//tao ra cac doi tuong co gai tri rieng biet
		LinearEquation p1=new LinearEquation();//goi ham khoi tao khong doi so
		p1.solve();
		
		LinearEquation p2=new LinearEquation();
		p2.b= 0;
		p2.c= 2;
		p2.solve();
		
		LinearEquation p3=new LinearEquation(0,0);//goi ham khoi tao co doi so
		p3.solve();

	}

}
