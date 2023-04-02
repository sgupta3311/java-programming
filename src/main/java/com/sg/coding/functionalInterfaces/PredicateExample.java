package com.sg.coding.functionalInterfaces;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample implements Predicate<Student> {

    @Override
    public boolean test(Student student) {
        return student.getGradeLevel()>3;
    }



    public static Predicate<Student> getGPAFilter(){
        Predicate<Student> gpaFilter= student -> student.getGpa()>4;
        return gpaFilter;
    }

    public static Predicate<Student> getGradeLevel(){
        Predicate<Student> gradeFilter= student -> student.getGradeLevel()>4;
        return gradeFilter;

    }
    public static void main(String[] args) {
        List<Student> studentList=StudentDataBase.getAllStudents();
        List students=studentList.stream().filter(getGPAFilter()).collect(Collectors.toList());
        studentList.forEach(student -> {
            if(getGPAFilter().test(student)){
                System.out.println("After predicate : "+student);
            }
        });
        System.out.println("New student list based on GPA "+students);
        List studentCompositeList=studentList.stream().filter(getGPAFilter().and(getGradeLevel())).collect(Collectors.toList());
        System.out.println("for each composite filter "+studentCompositeList);
        studentList.forEach(student -> {
            if(getGPAFilter().test(student) && getGradeLevel().test(student)){
                System.out.println("ForEach composite filter "+student);
            }
        });
    }
}
