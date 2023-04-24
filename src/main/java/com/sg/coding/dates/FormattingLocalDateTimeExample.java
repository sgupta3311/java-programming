package com.sg.coding.dates;

import com.sg.coding.model.StudentDataBase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {
    static  String dateTime="2018-04-18T14:33:33";

    public static void parseDateTime(){
        LocalDateTime localDateTime=LocalDateTime.parse(dateTime);
        System.out.println(localDateTime);
        String localDateTime1=localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDateTime1);

        String dateTime2 = "2018-04-18abc14|33|33";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");

        System.out.println("custom date time format: " + LocalDateTime.parse(dateTime2,dateTimeFormatter1));
    }

    public static void main(String[] args) {
        parseDateTime();
    }
}
