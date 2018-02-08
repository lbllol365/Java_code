package ThinkingInJava;

class Game{
    Game(int i){
        System.out.println("Game contructor!");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(11);
        System.out.println("BoardGame contructor!!");
    }
}

public class Pac7_6 extends BoardGame{
    Pac7_6(){
        super(11);
        System.out.println("chess construtor");
    }

    public static void main(String[] args){
        Pac7_6 x = new Pac7_6();
    }

}
