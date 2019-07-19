package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        Member m1 = new Member();
        m1.setUserid("kim");
        m1.setName("김철수");
        m1.setPasswd("1234");
        m1.setTel("02-111-2222");
        m1.setEmail("kim@gmail.com");
        list.add(m1);

        Member m2 = new Member("park", "박성호", "1234", "02-222-2222", "park@gmail.com");
        list.add(m2);

        for (Member m : list) {
            System.out.println(m);
        }
    }


}
