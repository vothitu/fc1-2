 package mysinglelinkedlist;
 
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int x) 
    { 
    	data=x;
    	next= null;
    }
    Node(int x, Node t) { 
    	data=x; 
    	next=t;
    }
    public String toString() { 
    	return data + "-->"; 
    	}
}
 
public class MySingleLinkedList {
    Node head;
    MySingleLinkedList() { 
    	head= null;
    	}
    void add(int x)
    {
        head = new Node(x, head);
    }
    void in()
    {
        System.out.print("\n Noi dung danh sach:\n ===> ");
        Node p= head;
        while (p!=null) { System.out.print(p); p=p.next;}
        System.out.print(" null \n");
    }
    
    
    
    
    int dem()
    {
	int k=0;
	Node p= head;
	while(p!=null) { k++; p=p.next;}
	return k;
    } 
    int demle()
    {
	int k=0;
	Node p= head;
	while(p!=null) { if(p.data%2!=0) k++; p=p.next;}
	return k;
    } 
    int tong()
    {
	int k=0;
	Node p= head;
	while(p!=null) { 
		k=k+p.data; 
		p=p.next;
	}
	return k;
    }
    int max() 
    {
        int k;
        if(head==null) k=0; else k= head.data;
        Node p= head;
	while(p!=null) { if(k<p.data) k=p.data; p=p.next;}
	return k;
    }
    void taods()
    {
        int x;
        Node cuoi= null;
        head= null;
        Scanner kb= new Scanner(System.in);
        while(true)
        {
            System.out.print("\n Nhap so x de them vao danh sach:"); x= kb.nextInt();
            if(x==0) break;
            Node t= new Node(x);
            if(head== null) head= cuoi=t;
            else { cuoi.next= t; cuoi=t;}
        }
    }
    void append(int x)
    {
        Node t= new Node(x);
        if(head==null) head=t;
        else
        {
            Node p= head; while(p.next!=null) p=p.next;
            p.next=t;
        }
    }
    void insert(int x, int k)
    {
        if(k<1) System.out.println("\n Khong chen duoc");
        else 
            if(k==1) head= new Node (x, head);
            else
            {
                int vt=1;
                Node p= head;
                while(p!=null && vt<k-1) { vt++; p=p.next;}
                if(p==null) System.out.println("\n Vi tri chen ko hop le");
                else { Node t= new Node(x,p.next); p.next=t; }
            }
    }
    void xoad() 
    {
        if(head==null) System.out.println("\ndanh sach rong, ko xoa dc!");
        else head= head.next;
    }
    
    void xoac() 
    {
        if(head==null) System.out.println("\ndanh sach rong!");
        else 
            if(head.next==null)  head= null;
            else
            {
                Node p= head;
                while(p.next.next!=null) p=p.next;
                p.next= null;
            }
    }
   
    public static void main(String[] args) {
        //System.out.println("Free memory (bytes): " +  Runtime.getRuntime().freeMemory());
        //System.out.println("Total memory (bytes): " +  Runtime.getRuntime().totalMemory());
        //System.out.println("Total memory (bytes): " +  Runtime.getRuntime().maxMemory());
        MySingleLinkedList L= new MySingleLinkedList();
        //L.add(3); L.add(2);L.add(7); L.add(6);L.add(9); L.add(8);
        L.taods();
        L.in();
        System.out.println("\n So not trong danh sach la: " + L.dem());
        System.out.println("\n Tong cac not trong danh sach la: " + L.tong());
        System.out.println("\n So not le trong danh sach la: " + L.demle());
        System.out.println("\n Gia tri lon nhat trong danh sach la: " + L.max());
         L.insert(100, 3);
        L.in();
    }
}