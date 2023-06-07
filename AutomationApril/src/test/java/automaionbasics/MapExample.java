package automaionbasics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<Integer,String>();
        m.put(5767,"Aravinth");
        m.put(456,"sasi");

        System.out.println(m.values());
        System.out.println(m.get(456));

        for(Map.Entry h:m.entrySet()){

            System.out.println(h.getKey());
            System.out.println(h.getValue());


        }

    }
}
