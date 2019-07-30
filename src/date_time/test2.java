package date_time;

import java.time.*;

public class test2 {
    public static void main(String[] args) {
//        boolean validLeapYear = Year.of(2020).isLeap();
//        System.out.println(validLeapYear);
//
//        for (int i = 2000; i < 2100; i++) {
//            validLeapYear = Year.of(i).isLeap();
//            if (validLeapYear) {
//                System.out.println(i + "is a Leap Year");
//            }
//        }

//        LocalTime thisSec;
//        for (int i = 0; i < 10; i++) {
//            thisSec = LocalTime.now();
//
//            display(thisSec.getHour(), thisSec.getMinute(), thisSec.getSecond());
//
//        }

        System.out.printf("now: %s%n", LocalDateTime.now());
        System.out.printf("Apr 15, 1994 @ 11:30am : %s%n", LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
        System.out.printf("now (from Instant): %s%n", LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));

    }
    private static void display(int hour, int minute, int second){
        System.out.println(hour + ":" + minute + ":" + second);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
