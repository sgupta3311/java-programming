package com.sg.coding.streams_terminal;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsJoiningExample {
     private static List<Student> studentList=StudentDataBase.getAllStudents();
    public static String joining(){
        return studentList.stream().map(Student::getName).collect(Collectors.joining("-"));
    }

    public static String joiningWithDelimiterWithPrefix(){

        return studentList.stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","[","]"));
    }

    public static void main(String[] args) {
        System.out.println("Names : "+ joining());
        System.out.println("Names With Delimiter Prefix and Suffix : "+ joiningWithDelimiterWithPrefix());
    }
}
