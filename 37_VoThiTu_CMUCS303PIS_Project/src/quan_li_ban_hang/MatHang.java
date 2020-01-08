package quan_li_ban_hang;
 
import java.util.Scanner;

public class MatHang
{
	protected String maSP,tenSP,nhanVien,nhaCC;
	protected double  soluong,dongia;
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String ma) {
		this.maSP=ma;
	}
	public String getTenSP() {
		return maSP;
	}
	public void setTenSP(String ten) {
		this.tenSP=ten;
	}
	public String getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(String nv) {
		this.nhanVien=nv;
	}
	public String getNhaCC() {
		return nhaCC;
	}
	public void setNhaCC(String cc) {
		this.nhaCC=cc;
	}
	public double getSoluong() {
		return soluong;
	}
	public void setSoluong(double sl) {
		if(sl<0) this.soluong=0;
		else this.soluong=sl;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dg) {
		if(dg<0) this.dongia=0;
		else this.dongia=dg;
	}
	public MatHang() {
		this.maSP="";
		this.tenSP="";
		this.nhanVien="";
		this.nhaCC="";
	}
	public MatHang(String ma,String ten,String nv,String cc,int sl,double dg) {
		this.maSP=ma;
		this.tenSP=ten;
		this.nhanVien=nv;
		this.nhaCC=cc;
		this.soluong=sl;
		this.dongia=dg;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Ma SP:");
		this.setMaSP(kb.nextLine());
		System.out.println("Enter Ten SP:");
		this.setTenSP(kb.nextLine());
		System.out.println("Enter Ten Nha CC:");
		this.setNhaCC(kb.nextLine());
		System.out.println("Enter Ten Nhan Vien:");
		this.setNhanVien(kb.nextLine());
		System.out.println("Enter so luong mat hang:");
		this.setSoluong(kb.nextInt());
		System.out.println("Enter don gia:");
		this.setDongia(kb.nextDouble());
	}
	public void output() {
		System.out.println("Ma SP:"+this.maSP);
		System.out.println("Ten SP:"+this.tenSP);
		System.out.println("Nha Cung Cap:"+this.nhaCC);
		System.out.println("So Luong:"+this.soluong);
		System.out.println("Don gia:"+this.dongia);
		System.out.println("Nhan Vien:"+this.nhanVien);
	}
	public double solve() {
		return 0;
	}


	public static void main(String[] args) {
		MatHang h=new MatHang();
		h.input();
		h.output();
	}

}

