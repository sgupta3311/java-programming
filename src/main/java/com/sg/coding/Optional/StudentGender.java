package com.sg.coding.Optional;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.Optional;

public class StudentGender {
    public static Optional<String> getStudentNameOptional(){
        Optional<Student> student=Optional.ofNullable(StudentDataBase.getAllStudents().listIterator().next());
        if(student.isPresent()){
            return student.map(Student::getGender);
        }
        return Optional.empty();
    }

    public static Optional<String> getStudentNameOptional_2(){
       Optional<Student> student= Optional.ofNullable(StudentDataBase.getOptionalStudent().get());
        if(student.isPresent()){
            return student.map(Student::getName);
        }
        return student.empty();
    }

    public static void main(String[] args) {
        //getStudentNameOptional();
        System.out.println(getStudentNameOptional());
        Optional<String> student= getStudentNameOptional_2();
        if(student.isPresent()) {
            System.out.println("Student Name is "+student.get());
        }
        else {
            System.out.println("Name returned is empty");
        }
    }
}
