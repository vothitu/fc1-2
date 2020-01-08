package nhomdethuong;
import java.*;
import java.util.Scanner;
public class QLDate {
	String ngaymua,ngayban, nv;
	public String getNgaymua() {
		return ngaymua;
	}
	public void setNgaymua(String ngaymua) {
		this.ngaymua = ngaymua;
	}
	public String getNgayban() {
		return ngayban;
	}
	public void setNgayban(String ngayban) {
		this.ngayban = ngayban;
	}
	public String getNv() {
		return nv;
	}
	public void setNv(String nv) {
		this.nv = nv;
	}
	public QLDate() {}
	public QLDate(String ngaymua,String ngayban,String nv) {
		setNgaymua(ngaymua);
		setNgayban(ngayban);
		setNv(nv);		
	}
	
	public void input() {
		Scanner dt=new Scanner(System.in);
		System.out.println("ten nhan vien : ");
		setNv(dt.nextLine());
		System.out.println("ngay mua :");
		setNgaymua(dt.nextLine());
		System.out.println("ngay ban : ");
		setNgayban(dt.nextLine());
		
	}
	public void output() {
		System.out.println("ten nhan vien : "+getNv());
		System.out.println("ngay nhap san pham"+getNgaymua());
		System.out.println("ngay ban san pham : "+ getNgayban());
	}
	public static void main(String[] args) {
		QLDate yeu=new QLDate();
		yeu.input();
		yeu.output();
	}
}
