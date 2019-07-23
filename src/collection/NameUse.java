package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameUse {
    public static void main(String[] args) {
        Name n = new Name("kim", "chung");
        Name k = new Name("park", "jung");
        Name j = new Name("kim", "chung");

        List<Name> names = new ArrayList<>();
        names.add(n);
        names.add(k);
        names.add(j);

        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

//        int i = n.compareTo(k);
//        System.out.println(i);
//
//        System.out.println(n.equals(j));
//        System.out.println(n.equals(k));
    }
}


//abstract class why private must be used
//stream.collect(Collector.....