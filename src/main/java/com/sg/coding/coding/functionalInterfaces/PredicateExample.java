package com.sg.coding.coding.functionalInterfaces;



import com.sg.coding.coding.model.Student;
import com.sg.coding.coding.model.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample implements Predicate<Student> {

    @Override
    public boolean test(Student student) {
        return student.getGradeLevel()>3;
    }



    public static Predicate<Student>  gpaFilter(){
         Predicate<Student> gpaFilter= student -> student.getGpa()>4;
         return gpaFilter;
    }

    public static Predicate<Student> getGradeLevel(){
        Predicate<Student> gradeFilter= student -> student.getGradeLevel()>4;
        return gradeFilter;

    }
    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();
        List students=studentList.stream().filter(gpaFilter()).collect(Collectors.toList());
        studentList.forEach(student -> {
            if(gpaFilter().test(student)){
                System.out.println("After predicate : "+student);
            }
        });
        System.out.println("New student list based on GPA "+students);
        List studentCompositeList=studentList.stream().filter(gpaFilter().and(getGradeLevel())).collect(Collectors.toList());
        System.out.println("for each composite filter "+studentCompositeList);
        studentList.forEach(student -> {
            if(gpaFilter().test(student) && getGradeLevel().test(student)){
                System.out.println("ForEach composite filter "+student);
            }
        });
    }
}
