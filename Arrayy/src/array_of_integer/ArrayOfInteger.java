package array_of_integer;
//mac dinh tat ca moi lop trong java deu thua ke tu lop cha Oject
//k can ghi : extends Object;

public class ArrayOfInteger 
{
	private int n;
	private int []a;
	public ArrayOfInteger() {
		a=new int[2];
		n=0;
	}
	public ArrayOfInteger(int capacity) {
		if(capacity<0)
			a=new int[10];
		else
			a=new int[capacity];
		n=0;
	}
	public void add(int element)
	{
		//case 1: array is full, case2: array is not full
		if(n==a.length)
		{
			//new array
			int []b=new int[n*2];
			//copy all array to new array
			for(int i=0;i<n;i++)
				b[i]=a[i];
			a=b;
		}
		a[n]=element;
		n++;
	}
	public void add(int element, int index)
	{
		if(index<0||index>n)
			System.out.println("out of index");
		else
		{
		if(n==a.length)
		{ 
			int []b=new int [n*2];
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
		a[n-1]=0;
		n--;
		}
	}
	public boolean contains(int element)
	{
		for(int i=0;i<n;i++) {
			if(a[i]==element)
				return true;
		}
		return false;
	}
	public int indexOf(int element)
	{
		for(int i=0;i<n;i++)
		{
			if(a[i]==element)
				return i;
		}
		return -1;
	}
	public int size()
	{
		return n;
	}
	public Integer get(int index)
	{
		if(index<0||index>n)
		{
			System.out.println("out of index");
		return null;
		}
		else
			return a[index];
	}
	public void set(int index,int element)
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
			s=s+" "+a[i];
		return s; 
	}
	public void output() 
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}

	public static void main(String[] args) 
	{
		ArrayOfInteger q=new ArrayOfInteger();
		q.add(1);
		q.add(5);
		q.add(4);
		q.add(8);
		q.add(7);
		q.add(2);
		System.out.println(q.toString());
		q.add(9);
		System.out.println(q.toString());
		q.add(3, 6);
		System.out.println(q.toString());
		q.remove(4);
		System.out.println(q.toString());
		System.out.println(q.contains(5));
		System.out.println(q.indexOf(9));
		System.out.println(q.size());
		q.set(4,3);
		System.out.println(q.toString());
		System.out.println(q.get(5));
		
		
		

	}
}