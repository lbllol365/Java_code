package Data_Structure;

public class Node {
    protected Node next;//指针
    protected int data;//数据

    public Node(int data){
        this.data = data;
    }

    public void display(){
        System.out.println("data:" + data);
    }

    public void setNext(Node new_node){
        this.next = new_node;
    }
}
