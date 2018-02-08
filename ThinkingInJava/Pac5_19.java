package ThinkingInJava;

public class Pac5_19 {
    Pac5_19(String... args){
        for(String str : args){
            System.out.println(str);
        }
    }

    public static void main(String[] args){
        new Pac5_19("hello","World!!");
        String[] str1 = new String[]{"I","am","Jack",};
        new Pac5_19(str1);
    }
}
