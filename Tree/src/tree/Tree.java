package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree <E>{
	private class Node<E>{
		private E info;
		int level=1;
		
		private Node left, right;
		public Node( E info) {
			this.info=info;
			this.left=this.right=null;
			
		}
		public Node(E info,Node l,Node r) {
			this.info=info;
			this.left=l ;
			this.right=r;
		}
	}
	private Node root=null;
	int[] a=new int[100];
	int n=0;
	public Tree() {
		Node r1= new Node(4,new Node(7),null);
		Node r2= new Node(1,new Node(8),new Node(10,new Node(2),new Node(5)));
		root=new Node(3,r1,r2);
	}
	private void inOrder(Node r) {
		if(r!=null) {
			System.out.println(r.info+" ");
			inOrder(r.left);
			inOrder(r.right);
		}
	}
	public void inOder() {
		inOrder(root);
	}
	private void midOrder(Node r) {
		if(r!=null) {
			midOrder(r.left);
			System.out.println(r.info);
			midOrder(r.right);
		}
	}
	public void midOrder() {
		midOrder(root);
	}
	private void postOrder(Node r) {
		if(r!=null) {
			postOrder(r.left);
			postOrder(r.right);
			System.out.println(r.info);
		}
	}
	public void postOrder() {
		postOrder(root);
	}
	private int sum(Node r) {
		if(r==null) return 0;
		else
			return (int) r.info +sum( r.left) + sum(r.right);
	}
	public void sum() {
		System.out.println("sum= " + sum(root));
	}
// tinh tong chan
	private int sumc(Node r) {
		if(r==null) return 0;
		else {
			if((int)r.info %2==0) 
				return (int)r.info+sumc(r.left)+sumc(r.right);
			else
				return sumc(r.left)+ sumc(r.right);
		}
	}
	public int sumc() {
		return sumc(root);
	}
	// dem so not trong cay
	private int soNode(Node r) {
		if(r==null)
			return 0;
		else
			return 1+ soNode(r.left)+soNode(r.right);
	}
	public int soNode() {
		return soNode(root);
	}
	//so not la trong cay
	private int soLa(Node r) {
		if(r==null)
			return 0;
		else
			if(r.left==null && r.right==null)
			return 1;
			else
				return soLa(r.left)+soLa(r.right);
	}
	public int soLa() {
		return soLa(root);
	}
	// so node ben trai
	private int cout1(Node r) {
		if(r==null)
			return 0;
		else
			if(r.right==null&&r.left!=null||r.right!=null&&r.left==null)
				return 1+cout1(r.left)+cout1(r.right);
			return cout1(r.left)+cout1(r.right);
	}

	public int cout1() {
		return cout1(root);
	}
	//so not ben phai
	private int cout2(Node r) {
		if(r==null)
			return 0;
		else
			if(r.right==null&&r.left==null)
				return cout2(r.left)+cout2(r.right);
			return 1+cout2(r.left)+cout2(r.right);
	}
	public int cout2() {
		return cout2(root);
	}
	//dem cac node le
	private int demLe(Node r) {
		if(r==null)
			return 0;
		else
			if((int)r.info%2!=0)
				return 1+ demLe(r.left)+demLe(r.right);
		return demLe(r.left)+demLe(r.right);
	}
	public int demLe() {
		return demLe(root);
	}
	//tim x co trong cay con
	private boolean search(int x,Node node)
	{
		if(node == null)
			return false;
		if((int)node.info == x)
			return true;
		else return search(x,node.left) || search(x,node.right);
	}
	public boolean searh(int x)
	{
		return search(x,root.left) || search(x,root.right);
	}
	// chieu cao cua cay
	private int height(Node r) {
		if(r==null)
			return 0;
		else
			return 1+Math.max(height(r.left),height(r.right));
	
	}
	public int height() {
		return height(root);
	}
	//chieu rong cua cay
	public void chieurong() {
		if(root!=null) {
			Queue <Node>q=new LinkedList<Node>();
			q.add(root);
			while(!q.isEmpty()) {
				Node p=q.remove();
				System.out.println(p.info);
				if(p.left!=null)
					q.add(p.left);
				if(p.right!=null)
					q.add(p.right);
			}
		}
	}
	//tim muc cua gia tri x
	public void muc(int x) {
		if(root!=null) {
			Queue <Node> q = new LinkedList<Node>();
			q.add(root);
			while(!q.isEmpty()) {
				Node p=q.remove();
				if((int)p.info==x)
					System.out.println(p.level);
				if(p.left!=null)
				{
					p.left.level=p.level+1;
					q.add(p.left);
				}
				if(p.right!=null) {
					p.right.level=p.level+1;
					q.add(p.right);
				}
			}
		}
	}
	//chieu sau cua cay
	public void chieusau() {
		if(root!=null) {
			Stack <Node> s = new Stack <Node>();
			s.push(root);
			while(!s.isEmpty()) {
				Node p = s.pop();
				System.out.println(p.info);
				if(p.left!=null)
					s.push(p.left);
				if(p.right!=null)
					s.push(p.right);
			}
		}
	}
// kiem tra node goc co phai la gia tri lon nhat khong
	public void kiemTraRoot()
	{
		System.out.println("Root la max : "+(max() == (int)root.info));
	}
	public int max()
	{	
		int max = (int)root.info;
		if(root!= null)
		{
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			while(!q.isEmpty())
			{
				Node p = q.poll();
				if((int)p.info>max)
					max = (int)p.info;
				if(p.left!=null)
					q.add(p.left);
				if(p.right!=null)
					q.add(p.right);
				
			}
		}
		return max;
	}
	//gia tri lon nhat trong cay va cho biet muc
		public void timMax()
		{
			if(root!= null)
			{
				int max = max();
				Queue<Node> q = new LinkedList<Node>();
				q.add(root);
				while(!q.isEmpty())
				{
					Node p = q.poll();
					if((int)p.info == max)
						System.out.print("Level : "+ p.level);
					if(p.left != null )
					{
						p.left.level = p.level + 1;
						q.add(p.left);
					}
						
					if(p.right != null )
					{
						p.right.level = p.level + 1;
						q.add(p.right);
					}
						
				}
			}
		}
		//muc nhieu node nhat
	public void mucNhieuNodeNhat()
	{	
		if(root!= null)
		{
			int max = 1,muc = 1;
			Queue<Node> q = new LinkedList<Node>();
			System.out.println("Muc 1 : ");
			System.out.println(root.info);
			if(root.left != null)
			{
				root.left.level = root.level +1;
				q.add(root.left);
			}
			if(root.right != null)
			{
				root.right.level = root.level +1;
				q.add(root.right);
			}
			int maxTmp = 0,mucTmp = 0;
			while(!q.isEmpty())
			{
				Node r = q.poll();
				if(r.level != mucTmp)
				{	
					if(maxTmp > max)
					{
						max = maxTmp;
						muc = mucTmp;
					}
					maxTmp = 1;
					System.out.println("Muc "+r.level+" : ");
					System.out.println(r.info);
					mucTmp = r.level;
				} else {
					System.out.println(r.info);
					maxTmp++;
				}
				if(r.left != null)
				{
					r.left.level = r.level +1;
					q.add(r.left);
				}
				if(r.right != null)
				{
					r.right.level = r.level +1;
					q.add(r.right);
				}	
			}
			System.out.println("Muc co nhieu node nhat "+muc+" voi so node la "+max);
		}
		
	}
	//kiem tra cay can bang
	public void balancedTree()
	{
		System.out.println("The tree is balanced : "+canbang(root));
	}
	private boolean canbang(Node r)
	{
		if(r == null)
			return true;
		else
			if(Math.abs(height(r.left)-height(r.right))>1)
					return false;
			else
				return canbang(r.left)&&canbang(r.right);
	}
	private boolean canbanght(Node r)
	{
		if(r == null)
			return true;
		else
			if(Math.abs(sum(r.left)-sum(r.right))>1)
					return false;
			else
				return canbanght(r.left)&&canbanght(r.right);
	}
	public void cnht()
	{
		System.out.println("The tree is  : "+canbanght(root));
	}
	private void treeToArray(Node r) {
		if(r!=null) {
			treeToArray(r.left);
			a[n]=(int)r.info;
			n++;
			treeToArray(r.right);
		}
	}
	public boolean isAsceding() {
		for(int i=0;i<n;i++)
			if(a[i]>a[i+1])
				return false;
		return true;
	}
	public static void main(String[] args) {
		Tree<Integer> t = new Tree<Integer>();
		t.inOder();
//		System.out.println();
//		t.midOrder();
//		System.out.println();
//		t.postOrder();
//		System.out.println();
//		t.sum();
		System.out.println("tong chan: ");
		t.sumc();
		System.out.println("so node trong cay: ");
		System.out.println(t.soNode());
		System.out.println("so node la trong cay: ");
		System.out.println(t.soLa());
		System.out.println("so node ben trai");
		System.out.println(t.cout1());
		System.out.println("so not ben phai");
		System.out.println(t.cout2());
		System.out.println("node le:" +t.demLe());
		System.out.println("tim kiem gia tri x: ");
		System.out.println(t.searh(6));
		System.out.println("chieu cao:" +t.height());
		System.out.println("chieu rong");
		t.chieurong();
		System.out.println("muc");
		t.muc(8);
		System.out.println("chieu sau");
		t.chieusau();
		t.kiemTraRoot();
		System.out.println("gia trin lon nhat va muc: ");
		t.timMax();
		System.out.println("\nmuc co nhieu node nhat");
		t.mucNhieuNodeNhat();
		t.balancedTree();
		t.cnht();
		System.out.println("cay bst:"+t.isAsceding());

	}

}
