package automaionbasics;

import java.util.HashSet;
import java.util.Set;

public class SetExmaple {

    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        s.add("Aravinth");
        s.add("Aravinth");
        s.add("Hello");
        System.out.println(s);

        System.out.println(s.contains("mmm"));

        for(String i:s){
            System.out.println(i);
        }
    }
}
