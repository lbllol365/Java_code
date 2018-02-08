package ThinkingInJava;

public class Pac7_19 {
    private  final Pac7_19 p;
    private static int numOfObj = 0;
    private int cd;
    Pac7_19(){
        p = new Pac7_19(12);
    }

    Pac7_19(int cd){
        this.cd = cd;
        p = new Pac7_19();
    }
}
