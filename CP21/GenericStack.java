package CP21;

public abstract class GenericStack<E> implements Comparable<E> {
    private int DEFAULT_ARRAY_LARGE = 10;
    private E[] list = (E[])new Object[DEFAULT_ARRAY_LARGE];
    E[] list_new;
    private int id;

    @Override
    public int compareTo(Object o){
        GenericStack<E> stack = (GenericStack<E>) o;
        if(id < stack.id)
            return 1;
        else
            return  -1;
    }

    public abstract <E extends Comparable<E>> E max(E[] list);

    GenericStack(int id){
        this.id = id;
    }

    public int getsize(){
        int num = 0;
        while (list[num] != null){
            num++;
        }
        return num;
    }

    public E peek(){
        return list[this.getsize() - 1];
    }

    public E[] push(E o) {
        if(this.getsize() == DEFAULT_ARRAY_LARGE){
            list_new = (E[])new Object[2 * DEFAULT_ARRAY_LARGE];
            for(int i = 0;i < this.getsize();i++){
                list_new[i] = list[i];
            }
            return list_new;
        }
        else {
            list[this.getsize()] = o;
            return list;
        }
    }

    public E pop(){
        E o = list[getsize() - 1];
        list[getsize() - 1] = null;
        return o;
    }

    public boolean isEmpty(){
        if(this.getsize() == 0)
            return true;
        else
            return false;
    }
}
