package chapter3;
import java.time.*;

public class DatesAndTimeLesson {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        
        //setting local date
        LocalDate date1 = LocalDate.of(2005, 6, 7);
        LocalDate date2 = LocalDate.of(2015, Month.JANUARY, 7); //using enum
        
        //setting local time
        LocalTime time1 = LocalTime.of(6, 15, 0);
        LocalTime time2 = LocalTime.of(6, 15);
        LocalTime time3 = LocalTime.of(6, 15, 30, 40);

        //Date and Time
        LocalDateTime ldt1 = LocalDateTime.of(2005, Month.DECEMBER, 7, 6, 15);
        LocalDateTime ldt2 = LocalDateTime.of(date1, time1);
    
        //Date plus/minus - years, months, weeks, days
        System.out.println(date2.plusDays(40).minusWeeks(3));
        System.out.println(date2);

        //time plus/minus - hours, minutes, seconds, nanos
        System.out.println(time2.plusHours(5).minusNanos(300));
        System.out.println(time2);

        //DateTime plus/minus
        System.out.println(ldt1.plusDays(21).plusHours(2));
        System.out.println(ldt1);
    }   
}
