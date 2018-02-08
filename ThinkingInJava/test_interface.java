package ThinkingInJava;

interface Dianqi{
    void canTurnon();
    void canTurnoff();
}

interface Weapon{
    void canKill();
    void canHill();
}

interface Human{
    void canEat();
    void canFeed();
}

interface SuperHuman extends Dianqi,Weapon,Human{
    void canfly();
}

class Demo_mom{
    public void saysth(String s){
        System.out.println(s);
    }
}

class Demo_son extends Demo_mom implements SuperHuman{
    public void canKill(){
        System.out.println("Kill!");
    }
    public void canHill(){
        System.out.println("Hill");
    }
    public void canfly(){
        System.out.println("fly!");
    }
    public void canFeed(){
        System.out.println("Feed");
    }
    public void canEat(){
        System.out.println("Eat!");
    }
    public void canTurnoff(){
        System.out.println("Turn off");
    }
    public void canTurnon(){
        System.out.println("Turn on!");
    }


}


public class test_interface {
    public static void main(String[] args){
        Demo_son son = new Demo_son();
        test_interface a = new test_interface();
        a.deal_Dianqi(son);
        a.deal_Human(son);
        a.deal_superman(son);
        a.deal_Weapon(son);
    }
    public void deal_Dianqi(Dianqi d){
        d.canTurnoff();
        d.canTurnon();
    }
    public void deal_Weapon(Weapon weapon){
        weapon.canHill();
        weapon.canKill();
    }
    public void deal_Human(Human human){
        human.canEat();
        human.canFeed();
    }
    public void deal_superman(SuperHuman superHuman){
        superHuman.canfly();
    }
}
