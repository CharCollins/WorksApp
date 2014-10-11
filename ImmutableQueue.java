package jp.co.worksap.global;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ImmutableQueue<E> {
	
	private ArrayList<E> array;
	
	public ImmutableQueue(){
		array=new ArrayList<E>();
	}
	
	public ImmutableQueue(ArrayList<E> list){
		array=list;
	}
	
	public ImmutableQueue<E> enqueue(E e) throws IllegalArgumentException{
		if(e==null){
			throw new IllegalArgumentException();
		}
		array.add(e);
		return new ImmutableQueue(array);
	}
	
	public ImmutableQueue<E> dequeue() throws NoSuchElementException{
		if(array.size()==0){
			throw new NoSuchElementException();
		}
		ArrayList<E> copy=new ArrayList<E>();
		for(int i=1;i<array.size();i++)
			copy.add(array.get(i));
		return new ImmutableQueue(copy);
	}
	
	public E peek()throws NoSuchElementException{
		if(array.size()==0){
			throw new NoSuchElementException();
		}
		return array.get(0);
	}
	
	public ArrayList<E> peekAll(){
		return array;
	}
	
	public int size(){
		return array.size();
	}
	
	public boolean equals(ImmutableQueue<E> iq){
		return array.equals(iq.array);
	}
	
	public String toString(){
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		for(int i=0;i<array.size();i++)
			sb.append(array.get(i).toString());
		sb.append("]");
		return sb.toString();
	}
}
