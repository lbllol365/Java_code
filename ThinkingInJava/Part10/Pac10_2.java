package ThinkingInJava.Part10;

public class Pac10_2 {
    private String string = "Hello World";
    public String toString(){
        return string;
    }

    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for(int i = 0;i < 10;i++){
            sequence.add(new Pac10_2());
        }
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current().toString());
            selector.next();
        }
    }
}
