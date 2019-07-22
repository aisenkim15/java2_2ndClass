package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        System.out.println("Before Shuffle: " + list);
        Collections.shuffle(list);
        System.out.println("After Shuffle: " + list);
    }
}
