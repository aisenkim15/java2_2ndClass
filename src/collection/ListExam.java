package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExam {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add("하나");
        list.add(2);
        list.add(5.5);
        list.add(false);
        list.add(0, "zero");
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object ran : list) {
            System.out.println(ran);
        }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        list.stream().forEach(System.out::println);
    }
}
