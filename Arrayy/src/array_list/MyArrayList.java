package array_list;


import array_of_fraction.Fraction;
import array_of_integer.ArrayOfInteger;

public class MyArrayList <E> 
{
	
	private E[]a;
	private int n;
	
	public MyArrayList() 
	{
		a=(E[]) new Object[10];
		n=0;
	}
	public MyArrayList(int capacity) {
		if(capacity<0)
			a=(E[]) new Object[10];
		else
			a=(E[]) new Object[capacity];
		n=0;
	}
	public void add(E element)
	{
		//case 1: array is full, case2: array is not full
		if(n==a.length)
		{
			//new array
			E []b=(E[]) new Object[n*2];
			//copy all array to new array
			for(int i=0;i<n;i++)
				b[i]=a[i];
			a=b;
		}
		a[n]=element;
		n++;
	}
	public void add(E element, int index)
	{
		if(index<0||index>n)
			System.out.println("out of index");
		else
		{
		if(n==a.length)
		{ 
			E []b=(E[]) new Object [n*2];
			System.arraycopy(a,0,b,0,n);
			a=b;
		}
		for(int i =n; i>index; i--)
		{
			a[i]=a[i-1];
		}
		a[index]=element;
		n++;
		}
	}
	public void remove(int index)
	{
		if(index<0||index>=n)
			System.out.println("out of index");
		else
		{
			if(n==0)
				System.out.println("list of index");
			else
		for(int i=index;i<n-1;i++)
			a[i]=a[i+1];
		n--;
		}
	}
	public boolean contains(E element)
	{
		for(int i=0;i<n;i++)
			if(a[i].equals(element))
				return true;
		return false;
	}
	public int indexOf(E element)
	{
		for(int i=0;i<n;i++)
			if(a[i].equals(element))
				return i;
		return -1;
	}
	public int size()
	{
		return n;
	}
	public E get(int index)
	{
		if(index<0||index>n)
		{
			System.out.println("out of index");
		return null;
		}
		else
			return a[index];
	}
	public void set(int index,E element)
	{
		if(index<0||index>n)
		{
			System.out.println("out of index");
		}
		else
			a[index]=element;	
	}
	@Override
	public String toString()
	{
		String s="";
		for(int i=0;i<n;i++)
			s=s+"   "+a[i];
		return s; 
	}
	public void output() 
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args) 
	{
		//goi lop khuon mau MyArrayList, dua doi tuong Integer vao
		MyArrayList<Integer> arr1=new MyArrayList<Integer>();
		arr1.add(3);
		arr1.add(5);
		arr1.add(9);
		arr1.add(10);
		System.out.println(arr1.toString());
		
		//goi lop khuon mau MyArrayList, dua doi tuong Double vao
		MyArrayList<Double> arr2= new MyArrayList<Double>();
		arr2.add(3.4);
		arr2.add(6.4);
		arr2.add(5.1);
		System.out.println(arr2.toString());
		
		//goi lop khuon mau MyArrayList, dua doi tuong Fraction vao
		MyArrayList<Fraction> arr3= new MyArrayList<Fraction>();
		arr3.add( new Fraction(1,2));
		arr3.add(new Fraction(3,4));
		arr3.add(new Fraction(4,6));
		arr3.add(new Fraction(5,3));
		arr3.add(new Fraction(7,8));
		System.out.println(arr3.toString());
	

	}
}
