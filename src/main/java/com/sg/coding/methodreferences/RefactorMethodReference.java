package com.sg.coding.methodreferences;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class RefactorMethodReference {

    static Predicate<Student> predicateUsingLambda=(s) ->s.getGradeLevel()>3;
    static Predicate<Student> predicateUsingMethodReference=RefactorMethodReference::greaterThan;
    static BiPredicate<Student,Integer> predicateUsingMethodReference_Grade=RefactorMethodReference::greaterThan;

    static public boolean greaterThan(Student student){
       return student.getGradeLevel()>4;

    }

    static public boolean greaterThan(Student student,Integer grade){
        return student.getGradeLevel()>grade;

    }

    public static void main(String[] args) {
       List<Student> studentList= StudentDataBase.getAllStudents();
       studentList.forEach(student -> {
           if(predicateUsingMethodReference.test(student)){
               System.out.println(student.getName() +" : "+ student.getActivities());
           };
       });
       studentList.forEach(student -> {
           if(predicateUsingMethodReference_Grade.test(student,3)){
               System.out.println("Bipredicate "+student.getName() +" : "+ student.getActivities());
           }
       });
    }

}
