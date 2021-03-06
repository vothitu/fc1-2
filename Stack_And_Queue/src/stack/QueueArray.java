package stack;

public class QueueArray <E>{
	private E[] a;
	private int head, tail, size;
	public QueueArray() {
		a = (E[]) new Object[10];
		head = 0;
		tail = 0;
		size = 0;
	}
	public boolean isEmpty() {
		if(size==0) 
			return true;
		else
			return false;
	}
	public E add(E e) {
		if (size == a.length) {
			System.out.println("Queue is full");
				return null;	
		}
		else {
			a[tail] = e;
			tail = (tail+1) % a.length;}
			size++;
			return e;
	}
	public E remove() {
		if (size == 0) {
			System.out.println("Queue is empty");
			return null;
		}
		else {
		E tmp=a[head];
		a[head]=null;
		head = (head+1) % a.length;
		size--;
		return tmp;
		}
	}
	public E element(){
		if (size == 0){
			System.out.println("Queue is empty");
			return null;
		}
		else 
		return a[head];
		
	}
	public String toString() {
		int i=head;
		String s="";
		for(int c=1;c<=size;c++) {
			s=s+a[i]+" ";
			i=(i+1)%a.length;
		}
		return s;
	}
	public static void main(String[] args) {
		QueueArray <Integer> q=new QueueArray<Integer>();
		q.add(6);
		q.add(3);
		q.add(7);
		q.add(21);
		q.add(9);
		System.out.println(q.toString());
		q.remove();
		System.out.println(q.toString());
		System.out.println(q.element());
		System.out.println(q.isEmpty());
	}

}
