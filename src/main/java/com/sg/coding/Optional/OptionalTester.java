package com.sg.coding.Optional;

import java.util.Optional;

public class OptionalTester {
    Integer value1=null;
    Integer value2=new Integer(10);

    public void optionalImpl(){
        Optional<Integer> val1=Optional.ofNullable(value1);
        Optional<Integer> val2=Optional.of(value2);
        System.out.println("First parameter is present "+val1.isPresent());
        System.out.println("Second parameter is present "+val2.isPresent());
        Integer val=val1.orElse(new Integer(0));

        System.out.println("First parameter is present "+val1.isPresent()+" : value now: "+val1+ " ,final value : "+val);
        System.out.println("Second parameter is present "+val2.isPresent());
    }
    public static void main(String[] args) {
        new OptionalTester().optionalImpl();
    }
}
