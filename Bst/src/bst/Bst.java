package bst;


public class Bst <E>{
	private class Node<E>{
		private E info;
		private Node left, right;
		
		public Node(Comparable<E> info) {
			this.info=(E) info;
			this.left=this.right=null;
			
		}
		public Node(E info,Node l,Node r) {
			this.info=info;
			this.left=l ;
			this.right=r;
		}
	}
	private Node root=null;
	int[] a= new int [100];
	int n=0;
	private Node<E> add(Comparable<E> value, Node r){
		if(r==null) {
			r=new Node(value);
		return r;
		}
		else
			if(value.compareTo((E) r.info)<0) {
				r.left=add(value,r.left);
				return r;
			}
			else
				if(value.compareTo((E) r.info)>0) {
					r.right=add(value,r.right);
					return r;
				}
				else {
					System.out.println("da co gia tri trong cay");
					return r;
				}
	}
	public void add(Comparable<E> value) {
		root=add(value,root);
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
	private boolean find(Comparable<E> value, Node r){
		if(r==null)
			return false;
		else
			if(r.info==value)
				return true;
			else if(value.compareTo((E) r.info)<0)
				return find(value,r.left);
			else
				return find(value,r.right);
	}
	public void find(Comparable<E> value) {
	}
	private Node<E> remove(Comparable<E> value, Node r){
		if(r==null) {
			System.out.println("x not exit");
			return r;
		}
		else
			if(value.compareTo((E) r.info)<0) {
				r.left=remove(value,r.left);
				return r;
			}
			else
				if(value.compareTo((E) r.info)>0) {
					r.right=remove(value,r.right);
							return r;
				}
				else 
					if(r.left==null && r.right==null) {
						r=null;
					return r;
				}
			else//neu chi co con phai
				if(r.left==null) {
					r=r.right;
					return r;
				}
			else {
				Node <E> p=r.left;
				while(p.right!=null)
					p=p.right;
				r.info=p.info;
				r.left= remove((Comparable<E>) p.info,r.left);
				return r;
			}
	}
	public void remove(Comparable<E> value) {
		root=remove(value,root);

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
//	public boolean isAsceding(Node r,int min,int max) {
//		if(r==null) {
//		return true;
//		}
//		if((int) r.info<min||(int) r.info>max) {
//			return false;
//		}
//		return isAsceding(r.left,min,(int)r.info)&&
//				isAsceding(r.right,(int) r.info,max);
//	}
//	public void isAsceding()
//    {
//        if (isAsceding(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
//            System.out.println("This is a BST.");
//        } else {
//            System.out.println("This is NOT a BST!");
//        }
//    }
	public static void main(String[] args) {
		Bst<Integer> tree=new Bst<Integer>();
		tree.add(-10);
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(8);
		tree.add(15);
		tree.inOder();
		System.out.println();
		tree.find(3);
		tree.inOder();
		tree.remove(4);
		tree.inOder();
		System.out.println(tree.isAsceding());
		
	}
}
