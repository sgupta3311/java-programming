package com.sg.coding.streams;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static List<Student> filterStudents(){
        List<Student> studentList=StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>4 ).filter(student -> student.getGradeLevel()>2).collect(Collectors.toList());
        return studentList;
    }

    public static void main(String[] args) {

        System.out.println(filterStudents());
    }
}
