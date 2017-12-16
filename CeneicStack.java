import java.util.*;

public class CeneicStack<E>{
	private ArrayList<E> list = new ArrayList<E>();

	public int get_size(){
		return list.size();
	}

	public E peek(){
		return list.get(get_size() - 1);
	}

	public void push(E o){
		list.add(o);
	}

	public E pop(){
		E o = list.get(get_size() - 1);
		list.remove(get_size() - 1);
		return o;
	}

	public boolean isEmpty(){
		return lsit.isEmpty();
	}
}