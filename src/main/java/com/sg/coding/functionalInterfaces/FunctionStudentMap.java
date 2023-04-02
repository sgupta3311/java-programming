package com.sg.coding.functionalInterfaces;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentMap {
    static Function<List<Student>, Map<String, Integer>> studentMap = students -> {
        Map<String, Integer> studentGradeMap=new HashMap<String, Integer>();
        Predicate<Student> gradeLevel= PredicateExample.getGradeLevel();
        students.forEach(student -> {
            if(gradeLevel.test(student)) {
                studentGradeMap.put(student.getName(), student.getGradeLevel());
                System.out.println(studentGradeMap);
            }
        });
        return studentGradeMap;
    };

    public static void main(String[] args) {


        System.out.println("Final Map "+  studentMap.apply(StudentDataBase.getAllStudents()));
    }

}