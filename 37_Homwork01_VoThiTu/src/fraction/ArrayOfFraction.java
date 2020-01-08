package fraction;

import java.util.Scanner;

public class ArrayOfFraction {
	
	private int n;
	private Fraction[] a = new Fraction[100];
	public int getN() 
	{
		return n;
	}
	public void setN(int nn) 
	{
		if(nn<0) n=0;
		else n=nn;
	}
	public void input() 
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter n:");
		n=kb.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter element"+ i + ":");
			//khoi tao va nhap Fraction
			Fraction f=new Fraction();
			f.input();
			a[i]=f;
		}
	}
	public void output() {
		for(int i=0;i<n;i++) 
		{
			a[i].output();
		}
		System.out.println();
	}
	public void maxFraction() 
	{
		int vt=0;
		double max=1.0*a[0].division1();
		for(int i=1;i<n;i++) {
			if(max<1.0*a[i].division1()) 
			{
				max=1.0*a[i].division1();
				vt=i;
			}
		}
		a[vt].output();
	}
	public void sumMaxFraction1() {
		int vt=0;
		double sumMax=1.0*a[0].division1();
		for(int i=0;i<n-1;i++) {
			Fraction f3=a[i].plus(a[i+1]);
			if(sumMax<1.0*f3.division1()) {
				sumMax=1.0*f3.division1();
				vt=i;
			}
		}
		a[vt].output();
		a[vt+1].output();
		a[vt].plus(a[vt+1]).output();
		System.out.println();
	}
	public void sumMaxfraction2() {
		int vt1=0,vt2=1;
		double sumMax=1.0*a[0].division1();
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				Fraction f3=a[i].plus(a[j]);
				if(sumMax<1.0*f3.division1()) {
					sumMax=1.0*f3.division1();
					vt1=i;
					vt2=j;
				}
			}
		}
		a[vt1].output();
		a[vt2].output();
		a[vt1].plus(a[vt2]).output();
		System.out.println();
	}
	public void sortFraction() {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(1.0*a[i].division1() > 1.0*a[j].division1()) {
					Fraction tmp=a[0];
					tmp=a[j];
					a[j]=a[i];
					a[i]=tmp;
					
				}
			}
		}
		for(int i=0;i<n;i++)
		a[i].output();
		
	}
	public Fraction sum() {
		Fraction sum1=a[0];
		for(int i=1;i<n;i++) {
			sum1 = sum1.plus(a[i]);
		}
		return sum1;
	}
	public void remove(int index) {
		for(int i=index;i<n-1;i++) {
			a[i]=a[i+1]; 
		}
		n--;
		System.out.println();
	}
	public void insert(Fraction f,int index) {
		for(int i=n-1;i>index;i--) {
			a[i]=a[i-1];
		}
		a[index]=f;
		n++;
		System.out.println();
	}
	public void removeDenominatorEven() {
		for(int i=0;i<this.n;i++) {
			if(a[i].getDenominator() %2 ==0) {
				remove(i);
				i--;
			}
		}
		for(int i=0;i<this.n;i++)
			a[i].output();
	}
	public boolean checkPrime(int x) {
		if(x == 1) return false;
		for(int i = 2 ; i <= x/2 ; i++)
			if(x % i == 0)
				return false;
		return true;
	}
	public void printPrime() {
		int vt=0;
		for( int i=0;i<n;i++)
			if( checkPrime(a[i].getNumerator())) {
				vt=i;
				a[vt].output();
			}
	}
	public static void main(String[] args)	{
		ArrayOfFraction arr=new ArrayOfFraction();
		arr.input();
		arr.output();
		System.out.println("The max Fraction:");
		arr.maxFraction();
		System.out.println("The sum max Fraction 1:");
		arr.sumMaxFraction1();
		System.out.println("The sum max Fraction 2:");
		arr.sumMaxfraction2();
		System.out.println("The sort Fraction 6:");
		arr.sortFraction();
		System.out.println("Sum:");
		arr.sum().output();
		System.out.println("remove: ");
		arr.remove(2);
		arr.output();
		System.out.println("insert: ");
		arr.insert(new Fraction(2,3),2);
		arr.output();
		System.out.println(" prime: ");
		arr.printPrime();
		System.out.println(" remove even: ");
		arr.removeDenominatorEven();
	}

}