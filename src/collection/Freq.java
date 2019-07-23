package collection;

import java.util.HashMap;
import java.util.Map;

public class Freq {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();

        for (String a : args) {
            Integer freq = m.get(a);
            System.out.println(">>>> freq: " + freq + "       /a: " + a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }
        System.out.println(m.size() + " distinct words: ");
        System.out.println(m);
    }
}
