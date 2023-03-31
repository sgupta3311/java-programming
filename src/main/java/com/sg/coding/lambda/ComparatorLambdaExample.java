package com.sg.coding.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        //Prior to Java 1.8
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // if o1=o2 -> 0, o1<02 -> -1 ,o1 ->o2 ->1
            }
        };
        System.out.println(comparator.compare(5,4));
        System.out.println(comparator.compare(5,41));

        Comparator<Integer> comparatorLambda= (obj1,obj2) ->
                obj1.compareTo(obj2);
      comparatorLambda.compare(3,1);
        System.out.println( comparatorLambda.compare(3,1));
    }
}
