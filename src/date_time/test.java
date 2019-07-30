package date_time;



import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Locale;

public class test {
    public static void main(String[] args) {
        /*
        Date date = new Date();
        System.out.println(date);
        System.out.printf("%s%n", DayOfWeek.MONDAY.minus(2));

        DayOfWeek dow = DayOfWeek.MONDAY;
        Date d = new Date();
        System.out.println("Date: " + d);

        Locale locale = Locale.getDefault();
        LocalDate now = LocalDate.now();
        System.out.println(locale);
        System.out.println("Current Date: " + now);

        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));

        System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.FRANCE));

        System.out.println(dow);
         */

//     Month Related
        Month month = Month.JANUARY;
        System.out.println(month);
//
//        LocalDate related
        LocalDate date = LocalDate.of(2019, Month.NOVEMBER, 20);
        LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println("date: " + date);
        System.out.println("next wednesday: " + nextWed);

        //Year Month
        YearMonth date1 = YearMonth.now();
        System.out.printf("%s: %d%n", date1, date1.lengthOfMonth());

        YearMonth date2 = YearMonth.of(2010, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date2, date2.lengthOfMonth());

        MonthDay monthDay = MonthDay.of(Month.FEBRUARY, 29);
        boolean validLeapYear = monthDay.isValidYear(2020);
        System.out.println("rst: " + validLeapYear);

    }
}

