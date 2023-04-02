package com.sg.coding.functionalInterfaces;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    private static Map<String,Integer> loginPageDocs=new HashMap<>();
    static BiFunction<List<Student>, Predicate<Student>,Map<String,Integer>> biFunction=(students,studentPredicate)->{
        students.forEach(student -> {
            if(studentPredicate.test(student)) {
                loginPageDocs.put(student.getName(), student.getGpa());
            }
        });
        return loginPageDocs;
    };

    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();
        Predicate<Student> gpaFilter=PredicateExample.getGPAFilter();
        Map<String,Integer> loginPageDocs= biFunction.apply(studentList,gpaFilter);
        System.out.println(loginPageDocs);
    }

}
