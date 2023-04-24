package com.sg.coding.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2018,01,01);
        LocalDate localDate_2=LocalDate.of(2019,12,30);
        Period period=localDate.until(localDate_2);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());

        Period period1 = Period.ofDays(10);
        System.out.println("getDays : " + period1.getDays());

        Period period2 = Period.ofYears(20);
        System.out.println("getYears : " + period2.getYears());

        System.out.println("toTotalMonths : " + period2.toTotalMonths());
        System.out.println("getDays : " + period2.getDays());
        Period period3=Period.between(localDate,localDate_2);
        System.out.println("get days "+period3.getDays());
        System.out.println("get Months "+period3.getMonths());
        System.out.println("get Years "+period3.getYears());


    }
}
