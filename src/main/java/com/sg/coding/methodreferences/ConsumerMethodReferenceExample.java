package com.sg.coding.methodreferences;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    static Consumer<Student> c1= System.out::println;
    static Consumer<Student> c2= student -> student.printListOfActivities();

    static Consumer<Student> c3= Student::printListOfActivities;
    static Consumer<Student> c4= Student::getActivities;


    public static void main(String[] args) {
       // StudentDataBase.getAllStudents().forEach(c1);
        //StudentDataBase.getAllStudents().forEach(c2);
        StudentDataBase.getAllStudents().forEach(c3);
        StudentDataBase.getAllStudents().forEach(student -> System.out.println("***********"));
        StudentDataBase.getAllStudents().forEach(c4);


    }
}
