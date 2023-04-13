package com.sg.coding.streams_terminal;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.stream.Collectors;

public class StreamSumAverageExample {

    public static Integer sum(){
        Integer totalNoOfBooks= StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(student ->
                student.getGpa()));
        return totalNoOfBooks;
    }
    public static Double average(){
        double totalNoOfNoteBooks=StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getGpa));
        return totalNoOfNoteBooks;
    }

    public static void main(String[] args) {
        System.out.println("Total GPA Count: "+sum());
        System.out.println("Average GPA of students: "+average());
    }
}
