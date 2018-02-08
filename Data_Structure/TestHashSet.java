package Data_Structure;

import java.util.*;

public class TestHashSet {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("Beijing");
        set.add("London");

        System.out.println(set);

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase() + " ");
        }
    }
}
