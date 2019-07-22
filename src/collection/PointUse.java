package collection;

import java.util.ArrayList;
import java.util.List;

public class PointUse {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        Point p1 = new Point("kim", 90, 80, 70);
        p1.calc();
        list.add(p1);

        list.add(new Point("park", 91, 84, 80));
        list.add(new Point("hong", 92, 83, 60));
        list.add(new Point("choi", 93, 83, 50));
        list.add(new Point("lee", 93, 83, 50));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        list.stream()
    }
}
