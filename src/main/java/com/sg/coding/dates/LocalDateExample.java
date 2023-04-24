package com.sg.coding.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println("local date is "+localDate);
        LocalDate localDate1=LocalDate.of(1982,11,18);
        System.out.println("localDate1 "+localDate1);
        System.out.println("Epoch day "+localDate.ofEpochDay(2));
        System.out.println("Epoch day "+localDate.ofEpochDay(1));
        System.out.println("Epoch day "+localDate.ofEpochDay(0));
        System.out.println("Year end date "+LocalDate.ofYearDay(2018,365));
        System.out.println("Local month "+localDate.getMonth());
        System.out.println("Local month "+localDate.getMonthValue());
        System.out.println("Date time format: "+localDate.format(DateTimeFormatter.ofPattern("yyyy:MM:dd")));
        /* Modyfing values in local date */
        System.out.println("Plus weeks: "+localDate.plusWeeks(1));
        System.out.println("Plus Days "+localDate.plusDays(1));
        System.out.println("Plus Months "+localDate.plusMonths(1));
        System.out.println("Day of week: "+localDate.getDayOfWeek());
        System.out.println("Leap year: "+localDate.isLeapYear());
        System.out.println("Leap year: "+localDate.plusYears(1).isLeapYear());
        System.out.println("is Before: "+localDate.isBefore(localDate));
        System.out.println("is After: "+localDate.isAfter(localDate));
        System.out.println("is Equal: "+localDate.isEqual(localDate));




    }
}
