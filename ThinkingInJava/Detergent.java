package ThinkingInJava;

class Cleaner{
    private String s = "Cleaner";
    public void append(String a){ s += a;}
    public void dilute() {append(" dilute()");}
    public void apply() {append(" apply()");}
    public void scrub() {append("scrub()");}
    public String toString() {return s;}

    public static void main(String[] args){
        Cleaner x = new Cleaner();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}


public class Detergent{
    private static Cleaner cleaner = new Cleaner();
    public void scrub(){
        cleaner.append("Detergent.scrub");
    }

    public void foam(){cleaner.append(" foam()");}
    public static void main(String[] args){
        Detergent x = new Detergent();
        cleaner.dilute();
        cleaner.apply();
        cleaner.scrub();
        x.foam();
    }

}


