package ThinkingInJava;


public class NewDetergent extends Detergent {
    public void scrub(){
        append("Hello I am new scrub function!!");
        super.scrub();
    }

    public void sterilize(){
        System.out.println("Hello I am sterilize function , the new function!!");
    }
}
