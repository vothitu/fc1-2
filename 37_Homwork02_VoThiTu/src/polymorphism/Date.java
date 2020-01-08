package polymorphism;

import java.util.Scanner;

public class Date 
{
	public Date() 
	{
		day=1;
		month=1;
		year=1900;
	}
	public Date(int d,int m,int y) 
	{
		setYear(y);
		setMonth(m);
		setDay(d);
	}
	private int day, month, year;
	public int getDay() 
	{
		return day;	
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	public void setDay(int d)
	{
		if(d < 0 || d > numberOfDay()) 
			day = 1;
		else
			day = d;
	}
	
	public void setMonth(int m )
	{
		if(m<=0 || m>12) month =1;
		else month = m;		
	}
	public void setYear(int y)
	{
		if(y<=1900||y>=5000)
			year=1900;
		else 
			year=y;
	}
	public int numberOfDay() 
	{
		if(month == 1||month== 3||month==5||month==7||month==8||month==10||month==12)
			return 31;
		else
			if(month==2) 
			{
				if((year %4 == 0 && year%100!=0)||(year%4 == 0 && year%400==0))
					return 29;
				else 
					return 28;
			}
		else 
			return 30;
	}
	public void nextDay() 
	{

			if( day==numberOfDay())
				if(month ==12 ) System.out.println("1/1"+ (++year));
				else System.out.println("1/"+(++ month)+ "/"+year);
			else System.out.println(++day +"/"+month+"/"+year);
	}
	public void input ()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter day : ");
		this.setDay(in.nextInt());
		System.out.println("Enter month : ");
		this.setMonth(in.nextInt());
		System.out.println("Enter Year : ");
		this.setYear(in.nextInt());
		
		
		
	}
	public void output()
	{
		System.out.println("day: " + this.day );
		System.out.println("month: " + this.month );
		System.out.println("year : " + this.year );
		
	}
	
	public static void main(String[] args)
	{
		/*Date q1 = new Date();
		q1.setYear(2009);
		q1.setMonth(12);
		q1.setDay(1);
		q1.nextDay();
		Date q2 = new Date(2,4,2000);
		q2.nextDay();*/
		
		Date  a = new Date();
		a.input();
		a.output();
		
	//	Date a2 = new Date(2019,12,20);
		//a2.output();
		
		}

}
