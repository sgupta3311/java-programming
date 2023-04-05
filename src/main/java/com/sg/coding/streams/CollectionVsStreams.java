package com.sg.coding.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionVsStreams {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");
        names.forEach(name->{
            System.out.println(name);
        });
        names.forEach(System.out::println);
        List<String> asList=Arrays.asList("Tracy","nancy","Kerry");
        asList.forEach(name->{
            System.out.println("Printing array "+name);
        });
        asList.stream().forEach(System.out::println);
    }
}
