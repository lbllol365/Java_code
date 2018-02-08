package Data_Structure;

public class LinkedList {
    public Node first;//声明头节点

    public LinkedList(){
        first = null;
    }

    public int getLength(){
        int length = 0;
        Node temp_node = first;
        while (temp_node != null){
            length++;
            temp_node = temp_node.next;
        }
        return length;
    }//返回链表的长度

    public boolean isEmpty(){
        return (first == null);
    }//判断链表是否为空

    public void clearList(){
        first = null;
    }//清空链表（Java的GC太爽了，不用像C++那样需要写内存回收语句了）

    public int getElem(int index) throws RuntimeException{
        if((index < 1) || (index > getLength()))
            throw new RuntimeException("所输入的索引值非法");
        int i = 1;
        Node temp_node = first;
        while (i != index){
            temp_node = temp_node.next;
            i++;
        }
        return temp_node.data;
    }//返回指定位置的数据

    public boolean LocateElem(int data){
        Node temp_node = first;
        while (temp_node.next != null){
            if(temp_node.data == data)
                return true;
            temp_node = temp_node.next;
        }
        return false;
    }//查找相关数据，存在返回真，不存在返回假

    public void insertElem(int index,int data) throws RuntimeException{
        int i = 1;
        Node temp_node = first;
        if((index < 1) || (index > getLength()))
            throw new RuntimeException("所给索引值非法");
        while (i != index){
            temp_node = temp_node.next;
            i++;
        }
        Node temp_node2 = new Node(data);
        temp_node2.setNext(temp_node.next);
        temp_node.setNext(temp_node2);
    }//在指定位置插入数据

    public void addNode(int data){
        Node new_node = new Node(data);//实例化一个新节点
        if(first == null){
            first = new_node;
            return;
        }
        Node temp_node = first;//用一个临时节点做条件判断，保护头节点
        while (temp_node.next != null){
            temp_node = temp_node.next;
        }
        temp_node.next = new_node;
    }//从头节点遍历，直至到某一节点的下一个节点为null（从链表尾部插入数据）

    public boolean deleteNode(int index){
        if((index < 1) || (index > getLength()))
            return false;
        if(index == 1)
            first = first.next;
        Node pre_node = first;
        Node last_node = first.next;
        int i = 0;
        while (last_node != null){
            if(i == index){
                pre_node.next = last_node.next;
                return true;
            }
            pre_node = last_node;
            last_node = last_node.next;
            i++;
        }
        return false;
    }//删除指定位置的元素



}
