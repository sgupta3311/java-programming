package com.sg.coding.coding.collections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayListEnhancements {
    static List<String> names= Arrays.asList("Sam","Torry","Jack","Dan");
   static AtomicInteger count=new AtomicInteger();
    static void listForEach(){
        names.forEach(s-> {
            System.out.println(s);
            System.out.println(count.getAndIncrement());
        });

    }

    public static void main(String[] args) {
        listForEach();
    }

}
