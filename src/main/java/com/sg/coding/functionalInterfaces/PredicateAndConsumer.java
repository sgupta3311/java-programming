package com.sg.coding.functionalInterfaces;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {
    public static void main(String[] args) {
        Consumer<Student> studentConsumer = getStudentByNameAndFilter();
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
    }

    private static Consumer<Student> getStudentByNameAndFilter() {
        Predicate<Student> gpaFilter = PredicateExample.getGPAFilter();
        Predicate<Student> gradeLevelFilter = PredicateExample.getGradeLevel();
        BiConsumer<String, List<String>> stringListBiConsumer = (name, activities) -> {
            System.out.println(name + " : " + activities);
        };
        Consumer<Student> studentConsumer = (student) -> {
        if (gpaFilter.test(student) && (gradeLevelFilter.test(student))){
            stringListBiConsumer.accept(student.getName(),student.getActivities());
         }
        };
        return studentConsumer;
    }
}