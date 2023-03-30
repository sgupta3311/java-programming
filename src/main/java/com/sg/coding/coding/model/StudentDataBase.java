package com.sg.coding.coding.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDataBase {


    static List<Student> al=new ArrayList<Student>();

    public static List<Student> getAllStudents(){
         Student s1=new Student("Sam",Arrays.asList("Tennis","Math","Swimming","Chess"),3,3);
         Student s2=new Student("Terry",Arrays.asList("Skating","Math","Swimming","Piano"),4,3);
         Student s3=new Student("Fox",Arrays.asList("Testing","Math","Science","English"),5,4);
        Student s4=new Student("Max",Arrays.asList("Automation","Economics","Commerce","English"),6,5);
         al=Arrays.asList(s1,s2,s3,s4);
         return al;
    }
}
