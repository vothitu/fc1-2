package tree;


public class canbang {
	private class Node<E>{
		private E info;
		
		
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
	private Node root;
    public static void main(String args[]) {
        canbang t = new canbang();
        Node root = null;
        
    }
    
}