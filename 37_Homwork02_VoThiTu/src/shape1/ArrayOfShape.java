package shape1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
public class ArrayOfShape {
	private Shape[] a = new Shape[100];
	private int n;
	public void readFile() throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("src/shape1/input.txt"));
		while(in.hasNextLine())
		{
			String str = in.next();
			if(str.compareTo("rectangle") == 0)
			{
				Shape s = new Rectangle(in.nextDouble(),in.nextDouble());
				a[n++] = s;
			}
			else if(str.compareTo("circle") == 0)
			{
				Shape s = new Circle(in.nextDouble());
				a[n++] = s;
			}
			else if(str.compareTo("triangle") == 0)
			{
				Shape s = new Triangle(in.nextDouble(),in.nextDouble(),in.nextDouble());
				a[n++] = s;
			}
		}
	}
	public void sortArea()
	{
		for(int i = 0 ; i < n ; i++)
			for(int j = 0 ; j < n - 1 ; j++)
			{
				if(a[i].area() > a[j].area())
				{
					Shape tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
	}
	public void write() throws FileNotFoundException
	{
		PrintStream p = new PrintStream(new File("src/shape1/output.txt"));
		for(int i = 0 ; i < n ; i++)
		{
			if(a[i] instanceof Triangle)
			{
				p.append("The area of triangle : "+a[i].area()+"\n");
			}
			else if(a[i] instanceof Circle)
			{
				p.append("The area of circle : "+a[i].area()+"\n");
			}
			else if(a[i] instanceof Rectangle)
			{
				p.append("The area of rectangle : "+a[i].area()+"\n");
			}
		}
			
	}
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numbers of shape : ");
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the geometry " + (i + 1));
			System.out.println("1.Circle\n2.Rectangle\n3.Triangle");
			int choose = in.nextInt();
			if (choose == 1)
				a[i] = new Circle();
			else if (choose == 2)
				a[i] = new Rectangle();
			else if (choose == 3)
				a[i] = new Triangle();
		}
	}
	public void output() {
		for (int i = 0; i < n; i++) {
			System.out.println("The geometry " + (i + 1));
			a[i].output();
		}
	}
	public static void main(String[] args) throws FileNotFoundException,IOException {
		ArrayOfShape a = new ArrayOfShape();
		//a.input();
		a.readFile();
		a.output();
		a.sortArea();
		a.write();
		
	}

}