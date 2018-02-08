package ThinkingInJava.Pac8_9;

public class test {
    public static void main(String[] args){
        Rodent[] t = new Rodent[5];
        t[0] = new Gerbil();
        t[2] = new Hamster();
        t[1] = new Mouse();
        t[3] = new Gerbil();
        t[4] = new Hamster();
        for(int i = 0;i < 4;i++){
            t[i].Eat();
        }
    }

}
