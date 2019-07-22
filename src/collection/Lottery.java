package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {
    public static void main(String[] args) {
        List<Integer> randomNum = new ArrayList<Integer>();
        for (int i=1; i<=45; i++) {
            randomNum.add(i);
        }
        Collections.shuffle(randomNum);
        List cutList = randomNum.subList(0, 7);
        System.out.println(cutList);

    }
}
