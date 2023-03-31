package com.sg.coding.random;

import java.util.function.Consumer;

public class StaticValueTest {
    static int  value=4;
    public static void main(String[] args) {
        value=6;
        System.out.println(value);
        Consumer<Integer> c1=(a)->{
            System.out.println(a+value);
        };
        c1.accept(5);
    }
}
