package ThinkingInJava;

interface Cycle{
    void goon();
    void gooff();
}

interface Cycle_factory{
    Cycle getCycle();
}

class Unicycle implements Cycle{
    public void goon(){
        System.out.println("Unicycle on");
    }

    public void gooff(){
        System.out.println("Unicycle off");
    }
}

class Unicycle_f implements Cycle_factory{
    public Cycle getCycle(){
        return new Unicycle();
    }
}

class Bicycle implements Cycle{
    public void goon(){
        System.out.println("Bicycle on");
    }

    public void gooff(){
        System.out.println("Bicycle off");
    }
}

class Bicycle_f implements Cycle_factory{
    public Bicycle getCycle(){
        return new Bicycle();
    }
}

class Tricycle implements Cycle{
    public void goon(){
        System.out.println("Tricycle on");
    }

    public void gooff(){
        System.out.println("Tricycle off");
    }
}

class Tricycle_f implements Cycle_factory{
    public Tricycle getCycle(){
        return new Tricycle();
    }
}



public class Pac9_18 {
    public static Cycle useFactory(Cycle_factory factory){
        return factory.getCycle();
    }

    public static void main(String[] args){
        Cycle cycle = useFactory(new Tricycle_f());

        cycle.gooff();
        cycle.goon();
    }
}
