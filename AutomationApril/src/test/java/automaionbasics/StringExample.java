package automaionbasics;

public class StringExample {

    public static void main(String[] args) {

        String a = "Learn";
        String b = "More";
        String c = "learn";

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(a.concat(b));
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(a.substring(1,4));

        String output = "CURRENCY 500";
        String numb = output.substring(9);
        System.out.println(numb);
    }
}
