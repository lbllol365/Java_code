package CoreJava.map;

import CoreJava.clone.Employee;

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        Map<String,Employee> staff = new HashMap<>();
        staff.put("144-111-222",new Employee("Amm",12.23));
        System.out.println(staff);

        staff.get("144-111-222");
        staff.remove("144-111-222");

        for(Map.Entry<String,Employee> entry:staff.entrySet()){
            String key = entry.getKey();
            Employee value = entry.getValue();
        }
    }
}
