package com.sg.coding.methodreferences;

import java.util.function.Function;

public class FunctionMethodReference {
    static Function<String,String> toUpperCaseMethodReference=  String::toUpperCase;
    static Function<String,String> toUpperCaseLambda=(s)->s.toUpperCase();

    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("test lambda expression"));
        System.out.println(toUpperCaseLambda.apply("test Method expression"));
    }
}
