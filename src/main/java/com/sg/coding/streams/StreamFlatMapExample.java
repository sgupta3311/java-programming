package com.sg.coding.streams;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {
    public static List<String> printStudentActivities(){
        List<String> studentActivities= StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).collect(Collectors.toList());
        return studentActivities;
    }

    public static void main(String[] args) {

        System.out.println( printStudentActivities());
    }
}
