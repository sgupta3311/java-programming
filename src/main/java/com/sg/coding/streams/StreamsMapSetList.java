package com.sg.coding.streams;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class StreamsMapSetList {

    private static List<String> nameUpperCase(List<Student> names){
       return names.stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toList());
    }

    private static Set<String> namesSetUpperCase(List<Student> names){
        return names.stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toSet());
    }

    private static Map<String, Integer>  namesLengthMap(List<Student> names){

        Map<String, Integer> namesLengthMap = names.stream().map(Student::getName)//Stream<String>
                .collect(toMap(String::toString,String::length)); // returns Map

        return namesLengthMap;
    }


    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("dan");
        names.add("jenny");
        List<Student> studentList=StudentDataBase.getAllStudents();

        System.out.println(namesSetUpperCase(studentList));
        System.out.println(nameUpperCase(studentList));
        System.out.println("namesLengthMap : " + namesLengthMap(studentList));
    }
}
