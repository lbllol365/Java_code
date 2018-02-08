package ThinkingInJava;

class IntManager{
    private IntManager(){};
    public static int[] intarry = new int[12];
    public static int[] getObject(){
        return intarry;
    }
}


public class Pac6_1 {
    public static void main(String[] args){
        int[] getit = IntManager.getObject();
    }

}


