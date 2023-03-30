package com.sg.coding.coding.functionalInterfaces;


import com.sg.coding.coding.model.Student;
import com.sg.coding.coding.model.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> studentName=(student) -> System.out.println(student.getName());
    static Consumer<Student> studentActivities=(student) -> System.out.println(student.getActivities());
    public static void printName(){
        StudentDataBase.getAllStudents().forEach(studentName);
    }

    public static void printNameAndActivities(){
        StudentDataBase.getAllStudents().forEach(studentName);
        StudentDataBase.getAllStudents().forEach(studentName.andThen(studentActivities));
    }

    public static void printNameAndActivitiesUsingCondition(){
        List<Student> personList = StudentDataBase.getAllStudents();
        personList.forEach((stu) -> {
            if(stu.getGpa()>=4.1){
                studentName.andThen(studentActivities).accept(stu);
        }
        });
    }

    public static void main(String[] args) {
        Consumer<String> c1=(s)-> System.out.println(s.toUpperCase());
        c1.accept("Printing Basic example");
       // printName();
        // printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
