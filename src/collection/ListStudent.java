package collection;

import java.sql.SQLOutput;
import java.util.*;

public class ListStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("2017001", "김철수", "국사", 1, "박교수"));
        list.add(new Student("2016002", "박찬호", "영문", 2, "최교수"));
        list.add(new Student("2015003", "송명호", "전산", 3, "김교수"));

        System.out.println("학번\t이름\t전공\t학년\t지도교슈");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getNum() + "\t" + s.getName() + "\t" + s.getMajor() + "\t" + s.getYear() + "\t" + s.getProfessor());
        }

        for (Student s : list) {
            System.out.println(s);
        }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        list.stream().forEach(System.out::println);

        Map<String, String> map = new HashMap<>();
        map.put("한국", "서울");
        map.put("England", "London");
        map.keySet().stream().forEach(System.out::println);

        map.forEach((jam, value) -> {System.out.println(jam + "--->" + value);});
    }


}
