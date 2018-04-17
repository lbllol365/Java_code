package CoreJava.enums;

import java.util.*;

public class EnumTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);//返回指定名字，给定类的枚举常量
        System.out.println("size =" + size);
        System.out.println("abbReviation=" + size.getAbbReviation());
        if(size == Size.EXTRA_LARGE)
            System.out.println("Good job!");
    }
}

enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private Size(String abbReviation){this.abbReviation = abbReviation;}
    public String getAbbReviation(){return abbReviation;}

    private String abbReviation;
}
