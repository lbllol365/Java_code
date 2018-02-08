package ThinkingInJava;

public class Pac14 {
    static String str1 = "Hello I am string 1";
    static String str2;
    static {
        str2 = "Hello I am String 2";
    }

    public static void test(){
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main(String[] args){
        Pac14.test();
    }
}
