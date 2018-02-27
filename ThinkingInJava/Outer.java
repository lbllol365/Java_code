package ThinkingInJava;

public class Outer {
    private String string;
    Outer(String s){
        this.string = s;
    }
    class Innner{
        private int c;
        private String string;
        Innner(int c){
            this.c = c;
        }

        Innner(String s){
            this.string = s;
        }
        public void sayHello(int c){
            System.out.println("Hello World!");
            this.c = c;
        }

        public String toString(){
            return new Outer("hello").toString();
        }
    }

    public Innner getInner(int c){
        return new Innner(c);
    }

    public static void main(String[] args){
        Outer outer = new Outer("hello");
        Innner innner = outer.getInner(2);
    }

}
