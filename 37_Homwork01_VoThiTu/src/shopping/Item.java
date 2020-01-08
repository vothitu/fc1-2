package shopping;

import java.util.Scanner;

public class Item {
	private String itemName;
	private int priceItem;
	private byte amout;
	public Item()
	{
		this.itemName = "";
	}
	public Item(String name,int price,byte i)
	{
		this.setItemName(name);
		this.setItemPrice(price);
		this.setAmout(i);
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		this.setItemName(in.next());
		this.setItemPrice(in.nextInt());
		this.setAmout(in.nextByte());
	}
	public int value()
	{
		return this.getItemPrice() * this.getAmout();
	} 
	public void setItemName(String name)
	{
		this.itemName = name;
	}
	public String getItemName()
	{
		return this.itemName;
	}
	public void setItemPrice(int price)
	{
		this.priceItem = price;
	}
	public int getItemPrice()
	{
		return this.priceItem;
	}
	public void setAmout(byte amout)
	{
		this.amout = amout;
	}
	public byte getAmout()
	{
		return this.amout;
	}
	public void output()
	{
		System.out.println("_ "+this.getItemName()+" "+this.getItemPrice()+" x "+this.getAmout()+"      "+this.value());
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Item x = new Item();
		x.input();
		x.output();
		
	}

}
