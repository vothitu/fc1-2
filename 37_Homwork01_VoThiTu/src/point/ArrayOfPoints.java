package point;

import java.util.Scanner;

public class ArrayOfPoints {
	private int n;
	private Point[] a = new Point[100];
	public int getN()
	{
		return n;
	}
	public void setN(int nn)  
	{
		if(nn<0) n=0;
		else n=nn;
	}
	public void input() {
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter n: ");
		n=kb.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Point "+ i+ ":");
			Point p = new Point();
			p.input();
			a[i]=p;
		}
	}
	public void output() {
		for(int i=0;i<n;i++) 
		{
			a[i].output();
		}
		System.out.println();
	}
	public void lagerDistence() {
		double max=a[0].distence(a[1]);
		for(int i=1;i<this.n-1;i++)
			for(int j=i+1;j<n;j++) {
				if(max<a[i].distence(a[j]))
						max=a[i].distence(a[j]);
		}
		System.out.println("max distence :" + max );
	}
	public void perimeterPoint() {
		double maxPerimeter=a[0].distence(a[1]);
		for(int i=1;i<this.n-2;i++) {
			for (int j=i+1;j<this.n-1;j++) {
				for(int k=j+1;k<this.n;k++) {
					if(maxPerimeter< a[i].perimeter( a[j], a[k]));
						maxPerimeter =a[i].perimeter(a[j],a[k]);
				}
			}
		}
		System.out.println("Max Of Perimeter: " + maxPerimeter);
	}
	public void areaPoint() {
		double maxArea=a[0].distence(a[1]);
		for(int i=1;i<this.n-2;i++) {
			for (int j=i+1;j<this.n-1;j++) {
				for(int k=j+1;k<this.n;k++) {
					if(maxArea< a[i].area( a[j], a[k]));
						maxArea =a[i].area(a[j],a[k]);
				}
			}
		}
		System.out.println("Max Of Area: " + maxArea);
	};
	
	public static void main(String[] args) {
		ArrayOfPoints arr= new ArrayOfPoints();
		arr.input();
		arr.output();
		arr.lagerDistence();
		arr.perimeterPoint();
		arr.areaPoint();
		
		

	}

}
