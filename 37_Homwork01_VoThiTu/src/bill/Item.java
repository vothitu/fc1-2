package bill;

import java.util.Scanner;

public class Item {
	private String itemName;
	private int itemPrice;
	private Byte amount;
	public  Item() {
		this.itemName=" ";
	}
	public Item( String name,int price,Byte amount) {
		this.itemName=name;
		this.itemPrice=price;
		this.amount= amount;
				
	}
	public String getitemName() {
		return itemName;
	}
	public int getitemPrice() {
		return itemPrice;
	}
	public Byte getamount() {
		return amount;
	}
	public void setitemName(String name) {
		this.itemName=name;
	}
	public void setitemPrice(int price) {
		this.itemPrice=price;
	}
	public void setamount(Byte amount) {
		this.amount= amount;
	}
	public int value() {
		return itemPrice*amount;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		this.setitemName(in.next());
		this.setitemPrice(in.nextInt());
		this.setamount(in.nextByte());
	}
	public void output() {
		System.out.println("_ "+this.getitemName()+" "+this.getitemPrice()+" x "+this.getamount()+"      "+this.value());
		
	}
	public static void main(String[] args) {
		Item a= new Item();
		a.output();
		a.value();
		

	}

}
