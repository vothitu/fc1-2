package stack;

import stack.MyStackLinkedList.Node;

public class QueueLinkedList<E> {
	private class Node {
		private E info;
		private Node next;
		public Node(E info) 
		{
			this.info=info;
			this.next=null;
		}
		public Node(E info,Node next) 
		{
			this.info=info;
			this.next=next;
		}
	}
	private Node head,tail;
	private int size;
	public QueueLinkedList() {
	head = tail = null;
	size = 0;
	}
	public E add(E e) {
	Node q = new Node(e);
	if (tail == null)
		head = q;
	else
		tail.next = q;
		tail = q;
		size++;
		return e;
	}
	public E remove(){
		if(size<=0){
		System.out.println("Queue is full");
		return null;
	}
		E q=head.info;
		head=head.next;
		size--;
		return q;
	}
		public E poll(){
			if(size<=0) return null;
				E temp=head.info;
				head=head.next;
				size--;
			return temp;
		}
		public E element() {
			if (size <= 0){
				System.out.println("Queue is empty");
				System.exit(0);
		}
			return head.info;
		}
		public E peek() {
			if (size <= 0)
				return null;
			return head.info;
		}
		public boolean isEmpty() {
			return (size <= 0);
		}

	

	public static void main(String[] args) {
		

	}

}
