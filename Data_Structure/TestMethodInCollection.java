package Data_Structure;

public class TestMethodInCollection {
    public static void main(String[] args){
        java.util.Set<String> set = new java.util.HashSet<String>();

        set.add("London");
        set.add("Paris");
        set.add("San Francisco");
        set.add("Beijing");

        System.out.println("set is" + set);
        System.out.println(set.size() + "elements in set");

        set.remove("London");
        System.out.println("\nset is" + set);
        System.out.println(set.size() + "elements in set");

        java.util.Set<String> set2 = new java.util.HashSet<String>();
        set2.add("London");
        set2.add("ShangHai");
        set2.add("Paris");
        System.out.println("\nset2 is" + set2);
        System.out.println(set2.size() + "elements in set2");
        System.out.println("\n" + set2.contains("London"));
        set.addAll(set2);
        System.out.print("\n" + set);

        set.removeAll(set2);
        System.out.println("\n" + set);

        set.retainAll(set2);
        System.out.println("\n" + set);
    }
}
