package com.sg.coding.streams_terminal;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamMappingExample {
     static List<Student> studentList=StudentDataBase.getAllStudents();
    public static Set<String> getStudentsByNameSet(){
        Set<String> nameSet= studentList.stream().collect(mapping(Student::getName,toSet())); // This will avoid additional map operation.
        return nameSet;
    }

    public static Set<String> getStudentByNameSet2(){
        Set<String> nameSet=studentList.stream().map(student -> student.getName()).collect(Collectors.toSet());
        return nameSet;
    }

    public static Map<String,Integer> getStudentNameActivities(){
        Map hm=studentList.stream().map(Student::getName).collect(toMap(String::toString,String::length));
        return hm;
    }
    public static List<String> getStudentByNameList(){
        List<String> nameList=studentList.stream().map(Student::getName).collect(Collectors.toList());
        return nameList;
    }

    public static List<String> getStudentByNameList2(){
        List<String> nameList=studentList.stream().collect(mapping(Student::getName,toList())); //This will avoid additional map operation.
        return nameList;
    }
    public static void main(String[] args) {
        System.out.println(getStudentsByNameSet());
        System.out.println(getStudentByNameSet2());
        System.out.println(getStudentByNameList());
        System.out.println(getStudentByNameList2());
        System.out.println(getStudentNameActivities());
    }
}
