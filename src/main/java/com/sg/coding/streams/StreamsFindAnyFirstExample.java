package com.sg.coding.streams;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>3.5).findAny();
    }
    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>31.5).findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> findAnyStudent=findAny();
        if(findAnyStudent.isPresent()){
            System.out.println(findAnyStudent.get());
        }
        else{
            System.out.println("No student found");
        }
        Optional<Student> findFirstStudent=findFirst();

        if(findFirstStudent.isPresent()){
            System.out.println(findFirstStudent.get());
        }
        else {
            System.out.println("No first student found");
        }



    }
}
