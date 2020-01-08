package shape1;
//100% abstraction la truu tuong, co nghia ko co phuong thuc co chua body, chi co phuong thuc truu tuong
import java.util.Scanner;

public interface Shape
{
	// declare fields: public static final by default
	// k co method body
	// chi co abstract method
	// duoc khai bao fields: private, protected default, public, static, find
	// ham khoi tao
	//phuong thuc co body
	// phuong thuc truu tuong
	public void input();
	public void output() ;
	public double area();
	public double perimeter();
	// ko co main method
}
