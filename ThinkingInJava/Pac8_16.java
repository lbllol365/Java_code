package ThinkingInJava;

public class Pac8_16 {
    private DianQi AlertStatus = new BingXiang();
    public void changeToCaidian(){
        AlertStatus = new CaiDian();
    }
    public void changeToKaoxiang(){
        AlertStatus = new Kaoxiang();
    }
}

class DianQi{
    public void Turnon(){
        System.out.println("Turn on the DianQi");
    }
}

class BingXiang extends DianQi{
    public void Turnon(){
        System.out.println("Turn on the BingXiang");
    }
}

class CaiDian extends DianQi{
    public void Turnon(){
        System.out.println("Turn on the CaiDian");
    }
}

class Kaoxiang extends DianQi{
    public void Turnon(){
        System.out.println("Turn on KaoXiang");
    }
}
