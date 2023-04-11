package com.sg.coding.streams;

import com.sg.coding.model.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch(){
       boolean result= StudentDataBase.getAllStudents().stream().allMatch(student ->
                student.getGpa()>=3.9);
       return result;
    };
    public static boolean anyMatch(){
        boolean result=  StudentDataBase.getAllNewStudents().stream().anyMatch(student -> student.getGpa()>=3.9);
        return result;
    };

    public static boolean noneMatch(){

        boolean result = StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=3.9);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(allMatch());
        System.out.println(anyMatch());
        System.out.println(noneMatch());
    }
}
