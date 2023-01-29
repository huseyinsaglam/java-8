package _08_localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Java8Tester {

    public static void main(String[] args) {

        System.out.println("******************* currentTime ***************************");
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);

        System.out.println("******************* toLocalDate ***************************");
        LocalDate date = currentTime.toLocalDate();
        System.out.println("date: " + date);

        System.out.println("******************* getMonth,  getDayOfMonth , getSecond ***************************");
        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month +" day: " + day +" seconds: " + seconds);

        System.out.println("******************* withDayOfMonth, withYear ***************************");
        LocalDateTime date2 = currentTime.withDayOfMonth(15).withYear(2025);
        System.out.println("date2: " + date2);

        System.out.println("******************* LocalDate.of ***************************");
        //12 december 2026
        LocalDate date3 = LocalDate.of(2026, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        System.out.println("******************* LocalTime.of ***************************");
        //22 hour 15 minutes
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        System.out.println("******************* LocalTime.parse ***************************");
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);
    }
}
