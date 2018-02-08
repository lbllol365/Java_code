package ThinkingInJava;

public class Pac5_15 {
    String str1;
    {
        str1 = "Hello I am a String";
        System.out.println(str1);
    }
    Pac5_15(){
        System.out.println("Hello World");
    }

    public static void main(String[] args){
        System.out.println("Pac5_15 is ready to die~~");
        new Pac5_15();
        System.out.println("Pac5_15 is done!");
    }
}
