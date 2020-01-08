package nhomdethuong;

import java.util.Scanner;

public class ArrayOfQLHangHoa {
	
	private int n;
	private QLhanghoa []a=new QLhanghoa[100];
	public int getN() {
		return this.n;
	}
	public void setN(int n) {
		this.n=n;
	}
	
	public void input() {
		
		Scanner h=new Scanner(System.in);
		System.out.println(" nhap so hang can tra cuu : ");
		setN(h.nextInt());
		for(int i=0;i<n;i++)
		{
			System.out.println(" nhap 1-Quan li tien mua // 2 - quan li tien ban");
			int chon =h.nextInt();
			if(chon==1)
			{
				QLhanghoa m=new QLTienM();
				m.input();
				a[i]=m;
			}
			else
				if(chon==2)
				{
					QLhanghoa b=new QLTienB();
					b.input();
					a[i]=b;
				}
				
			
			
		}
		
	}
	
	public void out() {
		for(int i=0;i<getN();i++)
		{
			System.out.println("\n loai hang "+ (i+1) +": ");
			a[i].output();
		}
	}
	
	
	public static void main(String[] args) {
		ArrayOfQLHangHoa h=new ArrayOfQLHangHoa();
		h.input();
		h.out();
		
	}

}
