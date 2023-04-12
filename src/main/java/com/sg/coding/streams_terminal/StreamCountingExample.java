package com.sg.coding.streams_terminal;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.List;

public class StreamCountingExample {
    public static long count(float gpa) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        return studentList.stream().filter(student -> student.getGpa() > gpa).count();
    }

    public static void main(String[] args) {
        System.out.println("Total count of student have count  " + count(5.9f));
    }

}
