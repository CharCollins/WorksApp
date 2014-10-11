package jp.co.worksap.global;

public class ImmutableQueueTest {

	public static void main(String args[]){
		ImmutableQueue<Integer> q=new ImmutableQueue<Integer>();
		q.enqueue(1);q.enqueue(2);q.enqueue(3);q.enqueue(4);q.enqueue(5);
		System.out.println("first time======================");
		System.out.println(q.toString());
		System.out.println("size: "+q.size());
		System.out.println("second time==================");
		System.out.println("pop: "+q.dequeue());
		q=q.dequeue();
		System.out.println(q.toString());
		System.out.println("size: "+q.size());
		System.out.println("third time==================");
		System.out.println("pop: "+q.dequeue());
		System.out.println(q.toString());
		System.out.println("size: "+q.size());
	}
	
}
