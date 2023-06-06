package automaionbasics;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample2 {

    public static void main(String[] args) {

        List <Integer> l = new ArrayList<Integer>();

        l.add(56);
        l.add(78);

        System.out.println(l);

        l.add(100);

        System.out.println(l);
        l.add(200);
        System.out.println(l);

        System.out.println(l.get(2));

        l.add(100);

        System.out.println(l);

        for(int y:l){
            System.out.println(y);
        }

        System.out.println("-------------");

        for(int i=0 ; i <l.size();i++){
            System.out.println(l.get(i));
        }

        List<String> h = new ArrayList<>();
        h.add("Aravinth");
        h.add("learn more");
        for(String u:h){
            System.out.println(u);
        }

        }
}
