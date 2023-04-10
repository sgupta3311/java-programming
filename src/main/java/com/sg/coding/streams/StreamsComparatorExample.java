package com.sg.coding.streams;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentByName(){
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
    }
    public static List<Student> sortStudentByGPA(){
       return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
    }
    public static List<String> unsortedStudentByName(){
        return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.toList());
    }
    public static List<Student> unsortedStudentByNameReversed(){
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(sortStudentByName());
        System.out.println(unsortedStudentByName());
        System.out.println(sortStudentByGPA());
        System.out.println(unsortedStudentByNameReversed());
    }
}
