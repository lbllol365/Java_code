package ThinkingInJava;

enum money{
    YIJIAO,ERJIAO,WUJIAO,YIYUAN,WUYUAN
}

public class Pac5_21 {
    public static void main(String[] args){
        for(money m : money.values()){
            System.out.println(m + ", ordinal " + m.ordinal());
        }
        money my;
        my = money.ERJIAO;
        switch (my){
            case YIJIAO: System.out.println("too less money");
            break;
            case ERJIAO: System.out.println("Three less money");
            break;
            case WUJIAO: System.out.println("Four less money");
            break;
            case YIYUAN: System.out.println("Five less money");
            break;
            case WUYUAN: System.out.println("Six less money");
            break;
            default: System.out.println("Maybe Error");
        }
    }

}
