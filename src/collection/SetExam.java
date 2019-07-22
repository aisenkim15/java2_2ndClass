package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
    public static void main(String[] args) {
        Set<String> hs = new TreeSet<>();
        hs.add("Korea");
        hs.add("Japan");
        hs.add("america");
        hs.add("Britain");
        hs.add("Korea");
        hs.add("korea");
        System.out.println();
        System.out.println("Printing the whole set: " + hs);
        System.out.println("Using for each statement..");
        for (String str : hs) {
            System.out.println(str);
        }

        Iterator<String> it = hs.iterator();
        System.out.println("Using iterator..");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("**************Lambda Expression******************");
        hs.stream().forEach(System.out::println);
    }
}
