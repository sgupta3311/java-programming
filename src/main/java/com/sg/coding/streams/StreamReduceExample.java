package com.sg.coding.streams;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamReduceExample {
    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream().reduce(1,(val1,val2)->val1*val2);
    }

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,3,4,5,13);
        performMultiplication(integers);
        System.out.println( performMultiplication(integers));
        List<Student> studentList=StudentDataBase.getAllStudents();
        List<String> studentActivities=studentList.stream().map(student -> student.getActivities()).flatMap(activity->activity.stream()).collect(Collectors.toList());
        List<String> studentName= studentList.stream().map(student -> student.getName()).collect(Collectors.toList());
        System.out.println(studentActivities);
        System.out.println("studentName--> "+studentName);
    }
}
