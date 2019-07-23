package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDups {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        for (String a : args) {
            s.add(a);
        }
        System.out.println(s.size() + "distinct words: " + s);

        Set<String> distinctWords = Arrays.asList(args).stream().collect(Collectors.toSet());
        System.out.println(distinctWords.size() + " distinct words: " + distinctWords);



    }
}
