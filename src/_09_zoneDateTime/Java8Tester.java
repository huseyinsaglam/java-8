package _09_zoneDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8Tester {

    public static void main(String[] args) {

        System.out.println("******************* ZonedDateTime.parse, ZonedDateTime.now ***************************");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2023-01-29T10:15:30+05:30[Asia/Istanbul]");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println("zonedDateTime: " + zonedDateTime);
        System.out.println("zonedDateTime1: " + zonedDateTime1);

        System.out.println("******************* ZoneId.of ***************************");
        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        System.out.println("******************* ZoneId.systemDefault ***************************");
        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);
    }
}
