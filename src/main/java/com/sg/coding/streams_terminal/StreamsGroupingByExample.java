package com.sg.coding.streams_terminal;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsGroupingByExample {
    private static List<Student> students=StudentDataBase.getAllStudents();
    /*public static void groupingByGender(){
        Map<String, List<Student>> studentMap= students.stream().collect(Collectors.groupingBy(Student::getGender));
        Stream.of(studentMap).forEach(System.out::println);
    } */

    public static void customizedGrouping(){
           Map<String,List<Student>> stringListMap= students.stream().collect(Collectors.groupingBy(student -> student.getGpa()>3.9? "OUTSTANDING" : "AVERAGE"));
           Stream.of(stringListMap).forEach(System.out::println);
    }

    public static void groupingByGenderCustomized(){
        Map<String,List<Student>> studentMap=students.stream().collect(Collectors.groupingBy((student) -> {
            if(student.getGender() !=null){
               return student.getGender().equalsIgnoreCase("male")? "Man":"Woman";
            }
            else{
                return "No Gender specified";
            }
        }));






        Stream.of(studentMap).forEach(System.out::println);
    }
    public static void main(String[] args) {

        //groupingByGender();
        //customizedGrouping();
        groupingByGenderCustomized();
    }
}
